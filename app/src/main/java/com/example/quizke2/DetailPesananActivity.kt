package com.example.quizke2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailPesananActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_pesanan)

        val nama = intent.getStringExtra("nama")
        val nim = intent.getStringExtra("nim")
        val menu = intent.getStringExtra("menu")
        val harga = intent.getIntExtra("harga", 0)

        val tvInfo = findViewById<TextView>(R.id.tvInfo)
        val etJumlah = findViewById<EditText>(R.id.etJumlah)
        val tvTotal = findViewById<TextView>(R.id.tvTotal)

        tvInfo.text = "Nama: $nama\nNIM: $nim\nMenu: $menu\nHarga: Rp$harga"

        findViewById<Button>(R.id.btnHitung).setOnClickListener {
            val jumlah = etJumlah.text.toString().toInt()
            val total = harga * jumlah
            tvTotal.text = "Total Bayar: Rp$total"
        }
    }
}