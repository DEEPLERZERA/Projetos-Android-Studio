package com.example.primeiro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var texto:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOk:Button = findViewById(R.id.btnOk)

        texto = findViewById(R.id.txtOla)

        btnOk.setOnClickListener{texto.setText("Meu primeiro APP !")}

    }
}