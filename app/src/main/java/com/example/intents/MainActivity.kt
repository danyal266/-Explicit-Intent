package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun zafar(view: android.view.View) {
        val data = zafar.text.toString()

        val intent = Intent(this,DetailActivity::class.java)
        intent.putExtra("Data",data)
        startActivity(intent)
    }
}