package com.example.soma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edNum1:EditText=findViewById(R.id.edNum1)
        val edNum2:EditText=findViewById(R.id.edNum2)
        val txtResult:TextView=findViewById(R.id.txtResultado)
        val btnSoma:Button=findViewById(R.id.Somar)
        val btnMulti:Button=findViewById(R.id.Multiplicar)

        btnSoma.setOnClickListener {
            txtResult.text=(edNum1.text.toString().toInt() + edNum2.text.toString().toInt()).toString()
        }

        btnMulti.setOnClickListener {
            txtResult.text=(edNum1.text.toString().toInt() * edNum2.text.toString().toInt()).toString()
        }
    }
}