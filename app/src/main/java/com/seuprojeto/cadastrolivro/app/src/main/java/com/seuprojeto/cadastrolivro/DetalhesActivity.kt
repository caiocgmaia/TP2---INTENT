package com.seuprojeto.cadastrolivro

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        val txtTitulo = findViewById<TextView>(R.id.txtTitulo)
        val txtAutor = findViewById<TextView>(R.id.txtAutor)

        val titulo = intent.getStringExtra("titulo")
        val autor = intent.getStringExtra("autor")

        txtTitulo.text = "Título: $titulo"
        txtAutor.text = "Autor: $autor"
    }
}
