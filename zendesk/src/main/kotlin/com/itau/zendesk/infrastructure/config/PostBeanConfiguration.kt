package com.itau.zendesk.infrastructure.config

import com.itau.zendesk.core.port.PostRepository
import com.itau.zendesk.core.service.PostServiceImp
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class PostBeanConfiguration {
    @Bean
    fun postService(postRepository: PostRepository): PostServiceImp = PostServiceImp(postRepository)

}