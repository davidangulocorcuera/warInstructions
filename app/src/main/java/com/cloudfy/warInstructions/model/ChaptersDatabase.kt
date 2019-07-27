package com.cloudfy.warInstructions.model

import android.content.Context
import androidx.room.Database
import com.cloudfy.warInstructions.entities.Chapter
import android.os.AsyncTask
import androidx.sqlite.db.SupportSQLiteDatabase
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters


@Database(entities = [Chapter::class], version = 1)
@TypeConverters(Converters::class)
abstract class ChaptersDatabase : RoomDatabase() {

    abstract fun chapterDao(): ChapterDao

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
                            ChaptersAsyncTask().execute()
                        }
                    })
                    .build()
            }

            return INSTANCE
        }

    }

    private class ChaptersAsyncTask internal constructor() : AsyncTask<Void, Void, Void>() {

        private val mAsyncTaskDao: ChapterDao = INSTANCE.chapterDao()

        override fun doInBackground(vararg voids: Void): Void? {
            val data: ArrayList<Chapter> = ArrayList()
            val firstClassroom = Chapter(0, "DAMP", 24, ArrayList())
            data.add(firstClassroom)
            val secondClassroom = Chapter(0, "DAMP", 24, ArrayList())
            data.add(secondClassroom)
            val thirdClassroom = Chapter(0, "DAMP", 24, ArrayList())
            data.add(thirdClassroom)
            mAsyncTaskDao.deleteAll()
            mAsyncTaskDao.insertAll(data)
            return null

        }
    }

}