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

class LingkaranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lingkaran)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inisialisasi komponen
        val inputJariJari: EditText = findViewById(R.id.inputJariJari)
        val btnSubmit: Button = findViewById(R.id.btnSubmit)
        val txtHasil: TextView = findViewById(R.id.txtHasil)

        btnSubmit.setOnClickListener {
            //Mengambil value dari inputNama dan menampilkan di Logcat
            val r = inputJariJari.text.toString().trim().toInt()

            Toast.makeText(this, "Anda telah melakukan klik pada tombol Hitung", Toast.LENGTH_SHORT).show()
            val luas = 3.14 * r * r;

            txtHasil.text = "Luas Lingkaran : $luas"
        }
    }
}