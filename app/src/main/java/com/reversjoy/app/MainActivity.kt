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
                val intent = Intent(this, VideoPreviewActivity::class.java)
                intent.putExtra("video_uri", it.toString())
                startActivity(intent)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.importVideoButton.setOnClickListener {
            videoPicker.launch("video/*")
        }
    }
}        binding.cameraButton.setOnClickListener {
            // Auto Camera Movement - later
        }

        binding.filterButton.setOnClickListener {
            // Filters - later
        }

        binding.vibranceButton.setOnClickListener {
            // Vibrance - later
        }
    }

    private fun openVideoPreview(uri: Uri) {
        // Video preview will be added in the next step.
    }
}}
