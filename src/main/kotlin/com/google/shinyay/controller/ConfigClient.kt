package com.google.shinyay.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableDiscoveryClient
class ConfigClient(@Value(value = "\${config.repo}") val repo: String) {

    @GetMapping("/config/test")
    fun test() = "Remote Repository info is $repo"

    @GetMapping("/myapp")
    fun myapp() = "Using Repository: $repo"
}