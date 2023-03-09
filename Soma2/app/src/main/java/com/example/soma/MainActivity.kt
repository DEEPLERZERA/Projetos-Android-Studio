package com.example.soma

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edNum1:EditText=findViewById(R.id.edNum1)
        val edNum2:EditText=findViewById(R.id.edNum2)
        val txtResult:TextView=findViewById(R.id.txtResultado)
        val btnSoma:Button=findViewById(R.id.Somar)
        val btnMulti:Button=findViewById(R.id.Multiplicar)
        val btnDiv:Button=findViewById(R.id.Divisao)
        val btnSubtracao:Button=findViewById(R.id.Subtracao)

        btnSoma.setOnClickListener {
            txtResult.text=(edNum1.text.toString().toFloat() + edNum2.text.toString().toFloat()).toString()
        }

        btnMulti.setOnClickListener {
            txtResult.text=(edNum1.text.toString().toFloat() * edNum2.text.toString().toFloat()).toString()
        }

        btnDiv.setOnClickListener {
            txtResult.text=(edNum1.text.toString().toFloat() / edNum2.text.toString().toFloat()).toString()
        }

        btnSubtracao.setOnClickListener {
            txtResult.text=(edNum1.text.toString().toFloat() - edNum2.text.toString().toFloat()).toString()
        }

    }
}