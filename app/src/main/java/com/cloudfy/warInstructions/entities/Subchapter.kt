package com.cloudfy.warInstructions.entities

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName


class Subchapter(
    @SerializedName("title")
    var title: String = "", var index: Int = 0,
    @SerializedName("paragraphs")
    var paragrahps: ArrayList<String> = ArrayList()
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeInt(index)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Subchapter> {
        override fun createFromParcel(parcel: Parcel): Subchapter {
            return Subchapter(parcel)
        }

        override fun newArray(size: Int): Array<Subchapter?> {
            return arrayOfNulls(size)
        }
    }

}

