package com.example.shift

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shift.databinding.ActivityProfileBinding
import com.example.shift.databinding.ItemCardProjectBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var profileActivityBinding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        profileActivityBinding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(profileActivityBinding.root)
    }
}