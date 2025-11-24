package com.example.futuremob_admin.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UsuarioResponse(
    @SerializedName("idUsuario") val id: Int,
    @SerializedName("nomeCompleto") val nome: String,
    @SerializedName("email") val email: String,
    @SerializedName("admin") val admin: Boolean,
    @SerializedName("caminhoImgPerfil") val caminhoImgPerfil: String?
):Serializable


