package com.itau.zendesk.entrypoint.rest.controller

import com.itau.zendesk.core.port.PostService
import com.itau.zendesk.entrypoint.rest.model.PostResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.*

@RestController
class EntryPointController(
    private val postService: PostService
) {

    @GetMapping("/id/{id_post}")
    fun searchPostById(@PathVariable(value = "id_post") id_post: String): ResponseEntity<PostResponse> {
        return ResponseEntity.ok(postService.getPostById(id_post))
    }
}
