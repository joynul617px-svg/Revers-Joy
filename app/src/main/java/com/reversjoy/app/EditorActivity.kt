package com.reversjoy.app

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class EditorActivity : AppCompatActivity() {

    private lateinit var editorVideo: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_editor)

        editorVideo = findViewById(R.id.editorVideo)

        val videoUri = intent.getStringExtra("video_uri")

        if (videoUri != null) {
            editorVideo.setVideoURI(Uri.parse(videoUri))

            editorVideo.setOnPreparedListener {
                it.isLooping = true
                editorVideo.start()
            }
        }

        val filterButton = findViewById<Button>(R.id.filterButton)

        filterButton.setOnClickListener {
            showFilterMessage()
        }
    }

    private fun showFilterMessage() {
        android.widget.Toast.makeText(
            this,
            "Filters coming next 🎨",
            android.widget.Toast.LENGTH_SHORT
        ).show()
    }
}
