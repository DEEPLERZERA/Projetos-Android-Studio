package com.example.truco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {


    var pontosTimeA:Int = 0
    var pontosTimeB:Int = 0
    lateinit var txtPlacarA:TextView
    lateinit var txtPlacarB:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val pTimeA:TextView=findViewById(R.id.PlacartimeA)
        val pTimeB:TextView=findViewById(R.id.PlacartimeB)
        val btnTrucoA:Button=findViewById(R.id.btnTruco)
        val btnTrucoB:Button=findViewById(R.id.btnTruco2)
        val btnCorreuA:Button=findViewById(R.id.btnCorreu)
        val btnCorreuB:Button=findViewById(R.id.btnCorreu2)
        val btnReiniciar:Button=findViewById(R.id.btnReiniciar)

        txtPlacarA = findViewById(R.id.PlacartimeA)
        txtPlacarB = findViewById(R.id.PlacartimeB)

        btnTrucoA.setOnClickListener{adicionaPonto(3, "A")}
        btnTrucoB.setOnClickListener{adicionaPonto(3, "B")}
        btnCorreuA.setOnClickListener{adicionaPonto(1, "A")}
        btnCorreuB.setOnClickListener{adicionaPonto(1, "B")}



    }
    fun adicionaPonto(pontos:Int, time:String){
        if(time=="A"){
            pontosTimeA+=pontos
            txtPlacarA.setText(pontosTimeA.toString())
        }else{
            pontosTimeB+=pontos
            txtPlacarB.setText(pontosTimeB.toString())
        }
    }


}