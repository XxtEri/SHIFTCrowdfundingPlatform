package com.example.shift

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shift.databinding.ActivityProfileBinding
import com.example.shift.databinding.ActivityProjectsFeedBinding

class ProjectsFeedActivity : AppCompatActivity() {

    private lateinit var projectsFeedBinding: ActivityProjectsFeedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        projectsFeedBinding = ActivityProjectsFeedBinding.inflate(layoutInflater)
        setContentView(projectsFeedBinding.root)

        transitionsBetweenActivity()
    }

    private fun transitionsBetweenActivity() {
        projectsFeedBinding.btnProfile.setOnClickListener {
            startActivity(Intent(this, AuthorizationActivity::class.java))
        }

        projectsFeedBinding.btnProjectsFeed.setOnClickListener {
            startActivity(Intent(this, ProjectsFeedActivity::class.java))
        }
    }
}