package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val data = intent.getStringExtra("Data")
        best_android.setText("Best Android tutorial for $data")
        neats.setText("Learn with $data")
    }
}