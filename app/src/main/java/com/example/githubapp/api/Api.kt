package com.example.githubapp.api

import com.example.githubapp.data.model.DetailUserResponse
import com.example.githubapp.data.model.User
import com.example.githubapp.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
//    @Headers("Authorization: token 271838d1cde9389ea39b4c0edaf0fa883293b83c")
    fun getSearchUsers(
        @Query ("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
//    @Headers("Authorization: token 271838d1cde9389ea39b4c0edaf0fa883293b83c")
    fun getUserDetail(
            @Path ("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
//    @Headers("Authorization: token 271838d1cde9389ea39b4c0edaf0fa883293b83c")
    fun getFollowers(
            @Path ("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
//    @Headers("Authorization: token 271838d1cde9389ea39b4c0edaf0fa883293b83c")
    fun getFollowing(
            @Path ("username") username: String
    ): Call<ArrayList<User>>

}