package com.caner.motionlayoutplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.motion_profile_header.*

class MainActivity : AppCompatActivity(R.layout.motion_profile) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Glide.with(this)
            .load("https://i.picsum.photos/id/1/200/200.jpg")
            .apply(RequestOptions.circleCropTransform())
            .into(ivProfile)
    }
}
