package com.example.omsairam.swoosh.Models

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by OM SAI RAM on 03-03-2018.
 */
class Player constructor(var league: String,var skill: String) : Parcelable{
    /*parcelable is used to wrap up everything inside a class and to convert it in
    a form that will be parced around from act to activity. something like zipping
    a file
     */
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(league)
        parcel.writeString(skill)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Player> {
        override fun createFromParcel(parcel: Parcel): Player {
            return Player(parcel)
        }

        override fun newArray(size: Int): Array<Player?> {
            return arrayOfNulls(size)
        }
    }
}