package com.otaku.kickassanime.api.model

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class Types (
    @SerializedName("name") val name: String? = null,
    @SerializedName("slug") val slug: String? = null
)