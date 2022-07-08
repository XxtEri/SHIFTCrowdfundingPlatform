package com.example.shift

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shift.databinding.ProjectsFeedBinding

class ProjectsFeedActivity : AppCompatActivity() {

    private lateinit var bindingProjectsFeed: ProjectsFeedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingProjectsFeed = ProjectsFeedBinding.inflate(layoutInflater)
        setContentView(bindingProjectsFeed.root)

        createListProjects()
    }

    /**
     * создание списка проектов в ленте
     */
    fun createListProjects() {

    }
}