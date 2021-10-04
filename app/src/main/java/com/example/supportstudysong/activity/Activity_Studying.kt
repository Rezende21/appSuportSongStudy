package com.example.supportstudysong.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.supportstudysong.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Activity_Studying : AppCompatActivity() {

    private lateinit var bt_studying: Button
    private lateinit var bt_correction: Button
    private lateinit var bt_studed: Button
    private lateinit var bt_float: FloatingActionButton
    private lateinit var recyclerview: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialazeviews()
        bt_float.setOnClickListener {
            val intent = Intent(this,float_Activity::class.java)
            startActivity(intent)
        }
    }

    private fun initialazeviews(){
        bt_float = findViewById(R.id.bt_float)
    }
}