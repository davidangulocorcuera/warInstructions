package com.cloudfy.warInstructions.entities

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.*
import com.cloudfy.warInstructions.model.Converters

@Entity(tableName = "chapters")

class Chapter(
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    var id: Int,

    @NonNull
    @ColumnInfo(name = "title")
    var title: String,

    @NonNull
    @ColumnInfo(name = "index")
    var index: Int,

    @NonNull
    @TypeConverters(Converters::class)
    @ColumnInfo(name = "subchapters")
    var subchapters: ArrayList<Subchapter>

): Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readInt(),
        TODO("subchapters")
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(title)
        parcel.writeInt(index)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Chapter> {
        override fun createFromParcel(parcel: Parcel): Chapter {
            return Chapter(parcel)
        }

        override fun newArray(size: Int): Array<Chapter?> {
            return arrayOfNulls(size)
        }
    }
}