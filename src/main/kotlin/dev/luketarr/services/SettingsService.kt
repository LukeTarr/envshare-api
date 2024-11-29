package dev.luketarr.services

import io.ktor.server.application.*
import io.ktor.server.engine.applicationEnvironment

class SettingsService {
    var redisHost : String
    var redisPort : Int
    var redisUser : String
    var redisPassword : String

    constructor(environment: ApplicationEnvironment){
        this.redisHost = environment.config.propertyOrNull("ktor.application.redis.host")?.getString() ?: ""
        this.redisPort = environment.config.propertyOrNull("ktor.application.redis.port")?.getString()?.toInt() ?: 5432
        this.redisUser = environment.config.propertyOrNull("ktor.application.redis.username")?.getString() ?: ""
        this.redisPassword = environment.config.propertyOrNull("ktor.application.redis.password")?.getString() ?: ""
    }
}