package com.example.weatherapp.models

import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("0") val zero:Zero,
    val base:String
):java.io.Serializable

data class Zero (
    val id:Int,
    val main:String,
    val description:String,
    val icon:String
):java.io.Serializable
