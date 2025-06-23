package com.example.laba_9_kotlin.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Clouds(
    val all: Int
) : Parcelable
