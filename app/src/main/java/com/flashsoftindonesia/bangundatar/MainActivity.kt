package com.flashsoftindonesia.bangundatar

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inisialisasi komponen
        val btnPersegi: Button = findViewById(R.id.btnPersegi)
        val btnPersegiPanjang: Button = findViewById(R.id.btnPersegiPanjang)
        val btnSegitiga: Button = findViewById(R.id.btnSegitiga)
        val btnLingkaran: Button = findViewById(R.id.btnLingkaran)

        btnPersegi.setOnClickListener {
            val intent = Intent(this, PersegiActivity::class.java)
            startActivity(intent)
        }

        btnPersegiPanjang.setOnClickListener {
            val intent = Intent(this, PersegiPanjangActivity::class.java)
            startActivity(intent)
        }

        btnSegitiga.setOnClickListener {
            val intent = Intent(this, SegitigaActivity::class.java)
            startActivity(intent)
        }

        btnLingkaran.setOnClickListener {
            val intent = Intent(this, LingkaranActivity::class.java)
            startActivity(intent)
        }
    }
}