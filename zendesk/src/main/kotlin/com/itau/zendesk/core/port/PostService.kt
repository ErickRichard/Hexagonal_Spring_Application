package com.itau.zendesk.core.port

import com.itau.zendesk.entrypoint.rest.model.PostResponse

interface PostService {
    fun getPostById(id: String): PostResponse
}