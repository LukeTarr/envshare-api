package dev.luketarr.services

import redis.clients.jedis.JedisPooled
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject


class RedisStore : KoinComponent {

    private val settingsService: SettingsService by inject()
    private val redisPool = JedisPooled(
        settingsService.redisHost,
        settingsService.redisPort,
        settingsService.redisUser,
        settingsService.redisPassword
    )


    fun redisPong() {
         println("PING " + this.redisPool.ping())
    }
}