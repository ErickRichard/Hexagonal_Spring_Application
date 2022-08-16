package com.itau.zendesk.entrypoint.rest.model

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
data class PostResponse(
    @JsonProperty("erick")
    val id: String,
    @JsonProperty("lorene ene")
    val userId: String,
    @JsonProperty("ivone")
    val title: String,
    @JsonProperty("silvio")
    val body: String
)