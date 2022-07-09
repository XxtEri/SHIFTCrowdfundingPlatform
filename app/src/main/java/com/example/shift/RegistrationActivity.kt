package com.example.shift

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shift.R
import com.example.shift.databinding.ActivityProfileBinding
import com.example.shift.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {

    private lateinit var registrationActivityBinding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        registrationActivityBinding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(registrationActivityBinding.root)
    }
}