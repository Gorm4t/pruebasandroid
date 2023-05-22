package com.example.agenda
import com.google.gson.annotations.SerializedName
data class Persona(@SerializedName ("nombre") val nombre:String,
                   @SerializedName ("apellido") val apellido:String,
                   @SerializedName ("edad") val edad:String,
                   @SerializedName ("id") val id: Int
)
