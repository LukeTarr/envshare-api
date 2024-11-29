package dev.luketarr.services

import io.ktor.server.application.*

class SettingsService(environment: ApplicationEnvironment) {
    var redisHost : String = environment.config.propertyOrNull("ktor.application.redis.host")?.getString() ?: ""
    var redisPort : Int = environment.config.propertyOrNull("ktor.application.redis.port")?.getString()?.toInt() ?: 5432
    var redisUser : String = environment.config.propertyOrNull("ktor.application.redis.username")?.getString() ?: ""
    var redisPassword : String = environment.config.propertyOrNull("ktor.application.redis.password")?.getString() ?: ""
}