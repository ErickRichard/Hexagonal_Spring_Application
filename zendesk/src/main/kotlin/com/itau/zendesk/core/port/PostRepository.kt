package com.itau.zendesk.core.port

import com.itau.zendesk.infrastructure.model.PostFromJsonplaceholder

interface PostRepository {
    fun getPostFromJsonObject(id: String): PostFromJsonplaceholder
}