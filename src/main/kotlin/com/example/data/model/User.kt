package com.example.data.model

import io.ktor.auth.*
import kotlinx.serialization.Serializable

@Serializable
data class User(
    val email:String,
    val hashPassword:String,
    val userName:String
):Principal
