package com.example.shift

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shift.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity(){

    private lateinit var profileActivityBinding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        profileActivityBinding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(profileActivityBinding.root)

        transitionsBetweenActivity()
    }

    private fun transitionsBetweenActivity() {
        profileActivityBinding.btnProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        profileActivityBinding.btnProjectsFeed.setOnClickListener {
            startActivity(Intent(this, ProjectsFeedActivity::class.java))
        }
    }
}