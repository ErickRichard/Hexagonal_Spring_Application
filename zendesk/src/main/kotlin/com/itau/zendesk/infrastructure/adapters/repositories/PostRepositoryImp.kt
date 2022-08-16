package com.itau.zendesk.infrastructure.adapters.repositories

import com.itau.zendesk.core.port.PostRepository
import com.itau.zendesk.infrastructure.model.PostFromJsonplaceholder
import com.itau.zendesk.infrastructure.client.PostClient
import feign.FeignException
import org.springframework.stereotype.Component

@Component
class PostRepositoryImp(private val postClient: PostClient) : PostRepository {

    override fun getPostFromJsonObject(id: String): PostFromJsonplaceholder {
        return try {
            postClient.getPostByFeignId(id = id).let {
                it.body!!
            }
        } catch (ex: FeignException) {
            throw ex
        }
    }
}