package com.plbear.imageandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.plbear.imageandroid.base.ImageJNI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_hello.setText(ImageJNI.helloworld())
    }
}
