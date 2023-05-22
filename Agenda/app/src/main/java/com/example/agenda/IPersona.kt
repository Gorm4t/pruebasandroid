package com.example.agenda
import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.GET
import retrofit2.http.Body
interface IPersona {
    @GET("wsLeer.php")
    fun getListaPersona():Call<List<Persona>>
    @POST("agrega.php")
    fun agregarPersona(@Body persona: Persona):Call<Resultado>
}