package com.reversjoy.app

import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class VideoPreviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val videoView = VideoView(this)

        val videoUri = intent.getStringExtra("video_uri")

        if (videoUri != null) {
            videoView.setVideoURI(Uri.parse(videoUri))

            videoView.setOnPreparedListener {
                videoView.start()
            }
        }

        setContentView(videoView)
    }
}
