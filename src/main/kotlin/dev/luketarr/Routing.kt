package dev.luketarr

import dev.luketarr.services.RedisStore
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val helloService: RedisStore by inject()

    routing {
        get("/") {
            helloService.redisPong()
            call.respondText("Hello World!")
        }
    }
}
