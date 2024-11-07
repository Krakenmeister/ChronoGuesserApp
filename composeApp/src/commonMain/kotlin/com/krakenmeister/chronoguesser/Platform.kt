package com.krakenmeister.chronoguesser

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform