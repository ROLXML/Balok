package com.example.volumeluasbalok

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi komponen dari layout
        val editTextPanjang = findViewById<EditText>(R.id.editTextPanjang)
        val editTextLebar = findViewById<EditText>(R.id.editTextLebar)
        val editTextTinggi = findViewById<EditText>(R.id.editTextTinggi)
        val buttonHitung = findViewById<Button>(R.id.buttonHitung)
        val textViewHasil = findViewById<TextView>(R.id.textViewHasil)

        // Set onClickListener pada tombol hitung
        buttonHitung.setOnClickListener {
            // Ambil nilai dari input dan konversi ke tipe Double
            val panjang = editTextPanjang.text.toString().toDoubleOrNull() ?: 0.0
            val lebar = editTextLebar.text.toString().toDoubleOrNull() ?: 0.0
            val tinggi = editTextTinggi.text.toString().toDoubleOrNull() ?: 0.0

            // Menghitung volume dan luas permukaan balok
            val volume = panjang * lebar * tinggi
            val luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi)

            // Tampilkan hasil di TextView
            textViewHasil.text = "Volume: $volume\nLuas Permukaan: $luasPermukaan"
        }
    }
}
