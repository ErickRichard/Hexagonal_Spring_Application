package com.itau.zendesk.entrypoint.rest.mapper

import com.itau.zendesk.infrastructure.model.PostFromJsonplaceholder
import com.itau.zendesk.entrypoint.rest.model.PostResponse as PostResp

class EntryPointConverter {
    companion object {
        fun toPostResponse(obj: PostFromJsonplaceholder): PostResp {
            return PostResp(
                userId = obj.userId,
                id = obj.id,
                title = obj.title,
                body = obj.body
            )
        }


        fun toPostListResponse(obj: List<PostFromJsonplaceholder>): List<PostResp> {
            val destinationObject: ArrayList<PostResp> = ArrayList()
            for (item in obj) {
                destinationObject.add(createPostObject(item))
            }
            return destinationObject
        }

        private fun createPostObject(post: PostFromJsonplaceholder): PostResp {
            return PostResp(
                id = post.id,
                userId = post.userId,
                title = post.title,
                body = post.body
            )
        }
    }
}