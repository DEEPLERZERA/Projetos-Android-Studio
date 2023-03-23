package com.example.truco

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {

    //Variáveis globais
    var pontosTimeA:Int = 0
    var pontosTimeB:Int = 0
    lateinit var txtPlacarA:TextView
    lateinit var txtPlacarB:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaração de variáveis
        val pTimeA:TextView=findViewById(R.id.PlacartimeA)
        val pTimeB:TextView=findViewById(R.id.PlacartimeB)
        val btnTrucoA:Button=findViewById(R.id.btnTruco)
        val btnTrucoB:Button=findViewById(R.id.btnTruco2)
        val btnCorreuA:Button=findViewById(R.id.btnCorreu)
        val btnCorreuB:Button=findViewById(R.id.btnCorreu2)
        val btnReiniciar:Button=findViewById(R.id.btnReiniciar)

        txtPlacarA = findViewById(R.id.PlacartimeA)  //Caixas de texto
        txtPlacarB = findViewById(R.id.PlacartimeB)

        //Funções para cada botão
        btnTrucoA.setOnClickListener{adicionaPonto(3, "A")}
        btnTrucoB.setOnClickListener{adicionaPonto(3, "B")}
        btnCorreuA.setOnClickListener{adicionaPonto(1, "A")}
        btnCorreuB.setOnClickListener{adicionaPonto(1, "B")}
        btnReiniciar.setOnClickListener{reinicia()}



    }
    fun adicionaPonto(pontos:Int, time:String){  //Função de adicionar pontos
        if(time=="A"){  //Condicional
            pontosTimeA+=pontos  //Incrementador de pontos
            txtPlacarA.setText(pontosTimeA.toString())
            if(pontosTimeA>=12){
                vitoria("A")
            }
        }else{
            pontosTimeB+=pontos
            if(pontosTimeB>=12){
                vitoria("B")
            }
            txtPlacarB.setText(pontosTimeB.toString())
        }
    }


    fun vitoria(time:String){ //Criando função de declarar vitoria
        val builder= AlertDialog.Builder(this) //Cria caixa de Alerta
        builder.setTitle("Vencedor !!")   //Seta título na caixa
        builder.setMessage("O Time " + time + " ganhou !!")  //Seta mensagem
        builder.setPositiveButton(R.string.yes){dialog,which ->   //Cria botão
            Toast.makeText(applicationContext, android.R.string.yes,
            Toast.LENGTH_LONG).show()
        }
        builder.show()  //Constroi essa tela
        reinicia() //Chamando func de reiniciar
    }


    fun reinicia(){ //Criando função de reiniciar
       pontosTimeA=0
       pontosTimeB=0
       txtPlacarA.setText("0")  //Setando texto
       txtPlacarB.setText("0")
       Toast.makeText(this, "Placar Reiniciado !", Toast.LENGTH_LONG) //Falando que foi reiniciado
    }


}