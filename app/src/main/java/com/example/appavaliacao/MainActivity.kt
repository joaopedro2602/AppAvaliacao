package com.example.appavaliacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val avaliar: Button = findViewById(R.id.avaliar)
        avaliar.setOnClickListener { avaliacao() }
    }

    private fun avaliacao() {


        val edit1: EditText = findViewById(R.id.edtNumber01)
        val edit2: EditText = findViewById(R.id.edtNumber02)



        if (edit1.length() != 0 && edit2.length() != 0 )
        {

            if (Integer.parseInt(edit1.text.toString()) == Integer.parseInt(edit2.text.toString()))
            {
                Toast.makeText(this, "Campo 1 é igual ao Campo 2", Toast.LENGTH_SHORT).show()
            }

            else if (Integer.parseInt(edit1.text.toString()) > Integer.parseInt(edit2.text.toString()))
            {
                Toast.makeText(this, "Campo 1 é maior que o Campo 2", Toast.LENGTH_SHORT).show()
            }

            else
            {
                Toast.makeText(this, "Campo 2 é maior que o Campo 1", Toast.LENGTH_SHORT).show()
            }
        }
        else
        {
            Toast.makeText(this, "Digite algum Número", Toast.LENGTH_SHORT).show()
        }

    }
}