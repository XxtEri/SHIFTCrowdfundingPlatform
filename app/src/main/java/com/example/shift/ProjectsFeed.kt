package com.example.shift

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shift.databinding.ProjectsFeedBinding

class ProjectsFeed : AppCompatActivity() {

    private lateinit var bindingProjectsFeed: ProjectsFeedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingProjectsFeed = ProjectsFeedBinding.inflate(layoutInflater)
        setContentView(bindingProjectsFeed.root)
    }
}