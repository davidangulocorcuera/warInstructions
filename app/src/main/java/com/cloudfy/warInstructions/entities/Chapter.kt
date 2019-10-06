package com.cloudfy.warInstructions.entities

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName


class Chapter(



    @SerializedName("title")
    var title: String,

    @SerializedName("index")
    var index: Int,

    @SerializedName("subchapters")
    var subchapters: ArrayList<Subchapter>

): Parcelable {

    constructor(parcel: Parcel) : this(
        
        parcel.readString(),
        parcel.readInt(),
        TODO("subchapters")
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
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