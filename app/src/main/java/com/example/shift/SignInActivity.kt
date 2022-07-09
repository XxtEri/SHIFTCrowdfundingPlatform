package com.example.shift

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shift.authorization.AuthorizationApi
import com.example.shift.authorization.AuthorizationApp
import com.example.shift.authorization.User
import com.example.shift.databinding.ActivityProfileBinding
import com.example.shift.databinding.ActivitySignInBinding
import com.example.shift.databinding.ItemCardProjectBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignInActivity : AppCompatActivity() {

    private lateinit var signInActivityBinding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        signInActivityBinding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(signInActivityBinding.root)
    }

    private fun getInfoUsers() {
        AuthorizationApp.retrofit
            .create(AuthorizationApi::class.java)
            .getAllUsers()
            .enqueue(object : Callback<List<User>> {
                override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                    val users = response.body()
                    if (users != null) {
                        showUsers(users.first())
                    }
                }

                override fun onFailure(call: Call<List<User>>, t: Throwable) {
                    // do something
                }
            })

    }

    private fun showUsers(sample: User) {
        val sampleText = sample.lastName + " " + sample.firstName

        println(sampleText)
    }
}