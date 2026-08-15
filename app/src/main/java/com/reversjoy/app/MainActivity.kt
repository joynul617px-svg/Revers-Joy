package com.reversjoy.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reversjoy.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.importVideoButton.setOnClickListener {
            // Video picker will be added next
        }

        binding.trackingButton.setOnClickListener {
            // AI tracking will be added later
        }

        binding.cameraButton.setOnClickListener {
            // Auto camera movement will be added later
        }

        binding.filterButton.setOnClickListener {
            // Filters will be added later
        }

        binding.vibranceButton.setOnClickListener {
            // Vibrance controls will be added later
        }
    }
}
