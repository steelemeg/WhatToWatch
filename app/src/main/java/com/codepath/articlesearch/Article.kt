package com.codepath.articlesearch
import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class SearchNewsResponse(
    @SerialName("results")
    val results: List<Article>?
)

@Keep
@Serializable
data class Article(
    @SerialName("overview")
    val abstract: String?,
    @SerialName("vote_average")
    val byline: String?,
    @SerialName("first_air_date")
    val first_air_date: String?,
    @SerialName("name")
    val headline: String?,
    @SerialName("backdrop_path")
    val mediaImageUrl: String?,
    @SerialName("poster_path")
    val mediaImageUrl2: String?
    ) : java.io.Serializable

