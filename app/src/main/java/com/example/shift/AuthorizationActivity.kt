package com.example.shift

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shift.R
import com.example.shift.databinding.ActivityAuthorizationBinding
import com.example.shift.databinding.ActivityProjectsFeedBinding
import com.example.shift.databinding.ActivitySignInBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AuthorizationActivity : AppCompatActivity() {

    private lateinit var authorizationBinding: ActivityAuthorizationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        authorizationBinding = ActivityAuthorizationBinding.inflate(layoutInflater)
        setContentView(authorizationBinding.root)

        addEventListener()
    }

    fun addEventListener() {
        authorizationBinding.buttonSignIn.setOnClickListener{
            startActivity(Intent(this, SignInActivity::class.java))
        }

        authorizationBinding.buttonRegistration.setOnClickListener{
            startActivity(Intent(this,RegistrationActivity::class.java))
        }
    }
}