package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.*
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("MYTAG", "I love tags")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val submitButton = findViewById<Button>(R.id.btSubmit)
        val name = findViewById<EditText>(R.id.etName)
        val nameString = name.text.toString()
        val greetingView = findViewById<TextView>(R.id.tvHello)
        submitButton.setOnClickListener {
            Log.i("MYTAG", "submitButton is clicked")
            if (nameString.isEmpty())
                Toast.makeText(this, "name is empty, please input your name!", Toast.LENGTH_SHORT).show()
            else
                greetingView.text = nameString
        }
    }
}