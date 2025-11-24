package com.flashsoftindonesia.bangundatar

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SegitigaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segitiga)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inisialisasi komponen
        val inputAlas: EditText = findViewById(R.id.inputAlas)
        val inputTinggi: EditText = findViewById(R.id.inputTinggi)
        val btnSubmit: Button = findViewById(R.id.btnSubmit)
        val txtHasil: TextView = findViewById(R.id.txtHasil)

        btnSubmit.setOnClickListener {
            //Mengambil value dari inputNama dan menampilkan di Logcat
            val a = inputAlas.text.toString().trim().toInt()
            val t = inputTinggi.text.toString().trim().toInt()

            Toast.makeText(this, "Anda telah melakukan klik pada tombol Hitung", Toast.LENGTH_SHORT).show()
            val luas = a * t / 2;

            txtHasil.text = "Luas Segitiga : $luas"
        }
    }
}