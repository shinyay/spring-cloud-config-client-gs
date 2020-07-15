package com.google.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudConfigClientGsApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudConfigClientGsApplication>(*args)
}
