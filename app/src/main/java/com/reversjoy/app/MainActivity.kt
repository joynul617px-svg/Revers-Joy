package com.reversjoy.app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.reversjoy.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val videoPicker =
        registerForActivityResult(
            ActivityResultContracts.GetContent()
        ) { uri: Uri? ->
            uri?.let {
                openEditor(it)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.importVideoButton.setOnClickListener {
            videoPicker.launch("video/*")
        }

        binding.trackingButton.setOnClickListener {
            // Tracking will be added later
        }

        binding.cameraButton.setOnClickListener {
            // Auto Camera will be added later
        }

        binding.filterButton.setOnClickListener {
            // Filters will be added later
        }

        binding.vibranceButton.setOnClickListener {
            // Vibrance will be added later
        }
    }

    private fun openEditor(uri: Uri) {
        val intent = Intent(this, EditorActivity::class.java)
        intent.putExtra("video_uri", uri.toString())
        startActivity(intent)
    }
}
