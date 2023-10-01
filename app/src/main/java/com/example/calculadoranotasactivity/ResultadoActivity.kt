package com.example.calculadoranotasactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    private lateinit var txtNotaFinal: TextView
    private lateinit var txtEstadoNota: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        txtNotaFinal = findViewById(R.id.txtNotaFinal)
        txtEstadoNota = findViewById(R.id.txtEstadoNota)

        val notaFinal = intent.getDoubleExtra("nota_final", 0.0)

        txtNotaFinal.text = "Nota final: $notaFinal"

        if (notaFinal >= 13) {
            txtEstadoNota.text = "Aprobado"
        } else {
            txtEstadoNota.text = "Desaprobado"
        }
    }
}