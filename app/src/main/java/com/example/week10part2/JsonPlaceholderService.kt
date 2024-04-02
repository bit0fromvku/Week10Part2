package com.example.week10part2

import retrofit2.Call
import retrofit2.http.GET

interface JsonPlaceholderService {
    @GET("posts")
    fun getPosts(): Call<List<Post>>
}