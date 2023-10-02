package com.example.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNom: EditText = findViewById(R.id.TxtNom)
        val btnOK: Button = findViewById(R.id.BtnOK)
        val lblNom: TextView = findViewById(R.id.LblNom)

        btnOK.setOnClickListener{
            var text = txtNom.text.toString()
            lblNom.text = "El teu nom és " + text
        }
    }
}