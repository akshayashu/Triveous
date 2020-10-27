package com.akshay.skyro

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NewsData(val cat: String, val s: String?, val s2: String?) : Parcelable