package com.example.plugins

import com.example.authentication.JwtService
import com.example.authentication.hash
import com.example.repository.repo
import com.example.routes.NoteRoutes
import com.example.routes.UserRoutes
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.configureRouting() {
    routing {

        get("/") {
            call.respondText("Hare Krishna!")
        }

        /*
        //path parameters
        //http://0.0.0.0:8081/note/6 --> 6
        get("/note/{id}"){
            val id = call.parameters["id"]
            call.respond("${id}")
        }

        //http://0.0.0.0:8081/token?email=shrughime0990@gmail.com&password=password&username=shruti
        get("/token"){
            val email = call.request.queryParameters["email"]!!
            val password = call.request.queryParameters["password"]!!
            val username = call.request.queryParameters["username"]!!
            val hashFunction = { s:String -> hash(s) }
            val jwtService = JwtService()
            val user = User(email,hashFunction(password),username)
            call.respond(jwtService.generateToken(user))

        }

        //http://0.0.0.0:8081/note?id=1234 --? 1234
        get("/note"){
            val id = call.request.queryParameters["id"]
            call.respond("${id}")
        }
        */

        UserRoutes(db = repo(), jwtService = JwtService(), hashFunction = { s:String -> hash(s) })
        NoteRoutes(db = repo(), hashFunction = { s:String -> hash(s) })

        //http://0.0.0.0:8081/notes/create body -- raw -- Hello Krishna
        route("/notes") {

            route("/create")
            {
            post {
                val body = call.receive<String>()
                call.respond(body)
                 }
            }

            delete {
                val body = call.receive<String>()
                call.respond(body)
            }

        }
        //PUT
        //PATCH


        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("static")
        }
    }
}
