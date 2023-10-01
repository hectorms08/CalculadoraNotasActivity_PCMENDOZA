package com.example.calculadoranotasactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var edtExamenParcial: EditText
    private lateinit var edtExamenFinal: EditText
    private lateinit var edtPromedioEvaluacionPermanente: EditText
    private lateinit var btnCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtExamenParcial = findViewById(R.id.edtExamenParcial)
        edtExamenFinal = findViewById(R.id.edtExamenFinal)
        edtPromedioEvaluacionPermanente = findViewById(R.id.edtPromedioEvaluacionPermanente)
        btnCalcular = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            val notaExamenParcial = edtExamenParcial.text.toString().toDouble()
            val notaExamenFinal = edtExamenFinal.text.toString().toDouble()
            val promedioEvaluacionPermanente = edtPromedioEvaluacionPermanente.text.toString().toDouble()

            val notaFinal = (notaExamenParcial * 0.2) + (notaExamenFinal * 0.2) + (promedioEvaluacionPermanente * 0.6)

            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("nota_final", notaFinal)
            startActivity(intent)
        }
    }
}