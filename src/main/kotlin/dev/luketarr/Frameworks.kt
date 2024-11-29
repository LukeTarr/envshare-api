package dev.luketarr

import dev.luketarr.services.RedisStore
import dev.luketarr.services.SettingsService
import io.ktor.server.application.*
import org.koin.dsl.module
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun Application.configureFrameworks() {
    install(Koin) {
        slf4jLogger()
        modules(module {
            single<RedisStore> {
                RedisStore()
            }
            single<SettingsService> {
                SettingsService(environment)
            }
        })
    }
}
