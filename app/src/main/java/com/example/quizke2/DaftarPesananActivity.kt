package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizke2.R

class DaftarPesanan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.daftar_pesanan)

        val btnMieAyam = findViewById<Button>(R.id.btnMieAyam)
        val btnNasiGoreng = findViewById<Button>(R.id.btnNasiGoreng)
        val btnSoto = findViewById<Button>(R.id.btnSoto)

        btnMieAyam.setOnClickListener {
            Toast.makeText(this, "Mie Ayam dipesan", Toast.LENGTH_SHORT).show()
        }

        btnNasiGoreng.setOnClickListener {
            Toast.makeText(this, "Nasi Goreng dipesan", Toast.LENGTH_SHORT).show()
        }

        btnSoto.setOnClickListener {
            Toast.makeText(this, "Sate Ayam dipesan", Toast.LENGTH_SHORT).show()
        }

    }
}