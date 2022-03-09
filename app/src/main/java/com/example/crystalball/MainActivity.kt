package com.example.crystalball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.crystalball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.clScreen.setOnClickListener {
            binding.tvShowResult.text = getTasks()
        }

    }

    private fun getTasks(): String {
        return resources.getStringArray(R.array.tasks)[randomNumber()]
    }

    private fun randomNumber(): Int {
        val size = resources.getStringArray(R.array.tasks).size - 1
        return (0..size).random()
    }
}