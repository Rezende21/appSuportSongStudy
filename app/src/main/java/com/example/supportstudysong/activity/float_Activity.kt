package com.example.supportstudysong.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.supportstudysong.R

class float_Activity : AppCompatActivity() {

    private lateinit var edit_hino : EditText
    private lateinit var salvar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_float_)
        edit_hino = findViewById(R.id.edit_hino)
        salvar = findViewById(R.id.bt_salvar)

    }
}