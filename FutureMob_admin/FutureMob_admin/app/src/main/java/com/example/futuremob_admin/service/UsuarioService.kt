package com.example.futuremob_admin.service

import com.example.futuremob_admin.models.LoginRequest
import com.example.futuremob_admin.models.UsuarioResponse
import retrofit2.Call
import retrofit2.http.*

interface UsuarioService {

    @POST("usuarios/autenticar")
    fun login(@Body login: LoginRequest): Call<UsuarioResponse>

}
