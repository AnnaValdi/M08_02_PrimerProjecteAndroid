package com.example.firstproject

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNom: EditText = findViewById(R.id.TxtNom)
        val btnOK: Button = findViewById(R.id.BtnOK)
        val lblNom: TextView = findViewById(R.id.LblNom)

        btnOK.setOnLongClickListener{
            var text = txtNom.text.toString()
            if(!text.equals("")) {
                lblNom.text = "El teu nom és " + text
                txtNom.setBackgroundColor(Color.WHITE)
            }else{
                lblNom.text = ""
                Toast.makeText(this, "No has introduit el teu nom", Toast.LENGTH_LONG).show()
                txtNom.setBackgroundColor(Color.RED)
            }
            return@setOnLongClickListener true
        }

    }
}