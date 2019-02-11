package com.example.germany

import android.content.Intent

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText

class MainActivity<view> : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText4)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }



}
