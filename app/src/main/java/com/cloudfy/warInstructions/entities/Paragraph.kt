package com.cloudfy.warInstructions.entities

import android.os.Parcel
import android.os.Parcelable

class Paragraph (var content: String = ""): Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(content)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Paragraph> {
        override fun createFromParcel(parcel: Parcel): Paragraph {
            return Paragraph(parcel)
        }

        override fun newArray(size: Int): Array<Paragraph?> {
            return arrayOfNulls(size)
        }
    }
}