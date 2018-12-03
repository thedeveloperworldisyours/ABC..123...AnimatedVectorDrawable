package com.thedeveloperworldisyours.alphabetnumber

import android.graphics.drawable.Animatable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            (capital_j_imageView.getDrawable() as Animatable).start()
            (capital_a_imageView.getDrawable() as Animatable).start()

        }
    }
}
