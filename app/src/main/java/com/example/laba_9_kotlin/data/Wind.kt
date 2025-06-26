package com.example.laba_9_kotlin.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Wind(
    val speed: Double,
    val deg: Int,
    val gust: Double
) : Parcelable
