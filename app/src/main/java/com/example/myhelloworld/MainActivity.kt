package com.example.myhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupHyperlink()
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
            Log.v("Helloworld", "Button clicked!")
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show()
        }

        }
    fun setupHyperlink() {
        val linkTextView = findViewById<TextView>(R.id.introtextView)
        linkTextView.movementMethod = LinkMovementMethod.getInstance()
    }
}


