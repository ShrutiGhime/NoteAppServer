package com.example

import com.example.plugins.*
import com.example.repository.DatabaseFactory
import io.ktor.application.*



fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)
    @Suppress("unused") // Referenced in application.conf
    @kotlin.jvm.JvmOverloads
    fun Application.module(testing: Boolean = false) {
        DatabaseFactory.init()
        configureSecurity()
        configureSerialization()
        configureMonitoring()
        configureRouting()
    }


