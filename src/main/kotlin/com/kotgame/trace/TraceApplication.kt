package com.kotgame.trace

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import zipkin2.server.internal.EnableZipkinServer

@EnableDiscoveryClient
@EnableZipkinServer
@SpringBootApplication
class TraceApplication

fun main(args: Array<String>) {
	runApplication<TraceApplication>(*args)
}
