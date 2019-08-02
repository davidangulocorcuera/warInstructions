package com.cloudfy.warInstructions.database

import android.content.Context
import androidx.room.Database
import com.cloudfy.warInstructions.entities.Chapter
import androidx.sqlite.db.SupportSQLiteDatabase
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.cloudfy.warInstructions.content.ChaptersManager
import com.cloudfy.warInstructions.model.ChaptersDao
import com.cloudfy.warInstructions.model.Converters
import org.jetbrains.anko.doAsync


@Database(entities = [Chapter::class], version = 1)
@TypeConverters(Converters::class)
abstract class ChaptersDatabase : RoomDatabase() {

    init {
        ChaptersManager.addChapters()
    }

    abstract fun chapterDao(): ChaptersDao

    companion object {
        lateinit var INSTANCE: ChaptersDatabase

        fun getDatabase(context: Context): ChaptersDatabase {
            synchronized(ChaptersDatabase::class.java) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    ChaptersDatabase::class.java, "chapters"
                )
                    .fallbackToDestructiveMigration()
                    .addCallback(object : RoomDatabase.Callback() {
                        override fun onOpen(db: SupportSQLiteDatabase) {
                            super.onOpen(db)
                            doAsync {
                                INSTANCE.chapterDao().deleteAll()
                                INSTANCE.chapterDao().insertAll(ChaptersManager.chapters)
                            }
                        }
                    })
                    .build()
            }
            return INSTANCE
        }

    }



}