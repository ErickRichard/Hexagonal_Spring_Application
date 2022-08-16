package com.itau.zendesk.core.service

import com.itau.zendesk.core.port.PostRepository
import com.itau.zendesk.core.port.PostService
import com.itau.zendesk.entrypoint.rest.mapper.EntryPointConverter
import com.itau.zendesk.entrypoint.rest.model.PostResponse
import org.springframework.stereotype.Component

class PostServiceImp(private val postRepository: PostRepository) : PostService {
    override fun getPostById(id: String): PostResponse {
        val result = postRepository.getPostFromJsonObject(id)
        return EntryPointConverter.toPostResponse(result)
    }
}