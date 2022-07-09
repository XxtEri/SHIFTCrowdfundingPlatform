package com.example.shift.authorization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shift.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AuthorizationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_sign_reg)
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