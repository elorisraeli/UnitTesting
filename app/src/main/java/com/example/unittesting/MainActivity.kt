package com.example.unittesting

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 1st Test
        val btn = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editText)
        val textViewChanges = findViewById<TextView>(R.id.textViewChanges)
        btn.setOnClickListener {
            // add 2 seconds to be able to see the change (the emulator run fast)
            Thread.sleep(2000)
            textViewChanges.text = editText.text }

        // 2nd Test
        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener {
            // add sleep to be able to see the change
            Thread.sleep(2000)
            textView.setBackgroundColor(resources.getColor(R.color.colorAccent)) }

    }
}
