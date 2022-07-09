package com.example.shift.authorization

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import java.security.Security

interface AuthorizationApi {

    @GET("/get/all")
    fun getAllUsers(): Call<List<User>>

    @GET("get/users/{login}{password}")
    fun getUser(@Path("login") login: String, @Path("password") password: String): Call<User>

    @GET("get/security/{email}")
    fun contains(@Path("email") email: String): Call<Boolean>

    @POST("post/user/new")
    fun createUser(@Body security: Security, @Body user: User): Call<Long>
}