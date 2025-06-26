package com.example.laba_9_kotlin.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ForecastResponse(
    val cod: String,
    val message: Int,
    val cnt: Int,
    val list: List<WeatherItem>,
    val city: City
) : Parcelable
