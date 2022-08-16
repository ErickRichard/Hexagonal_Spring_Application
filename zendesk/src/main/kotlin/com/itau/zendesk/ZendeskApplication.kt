package com.itau.zendesk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class ZendeskApplication

fun main(args: Array<String>) {
	runApplication<ZendeskApplication>(*args)
}
