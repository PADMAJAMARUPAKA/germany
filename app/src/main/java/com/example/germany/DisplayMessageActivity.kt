package com.example.germany

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
         findViewById<TextView>(R.id.textView).apply {
            text = message
    }



        // Get the Intent that started this activity and extract the string


        // Capture the layout's TextView and set the string as its text

    }
}
