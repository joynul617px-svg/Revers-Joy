package com.reversjoy.app

import android.net.Uri
import android.os.Bundle
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
                editorVideo.start()
            }
        }
    }
}
