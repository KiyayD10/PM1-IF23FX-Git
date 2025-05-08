package com.uti.pm1_if23fx_fop

import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Lat1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lat1)

//      variabel untuk object
        val edt_nilai1 = findViewById<EditText>(R.id.edt_nilai1)
        val edt_nilai2 = findViewById<EditText>(R.id.edt_nilai2)
        val edt_hasil = findViewById<EditText>(R.id.edt_hasil)
        val btn_hitung = findViewById<Button>(R.id.btn_hitung)
        val btn_reset = findViewById<Button>(R.id.btn_reset)

//      buat event
//      1. untuk btn_hitung
        btn_hitung.setOnClickListener {
//          ambil nilai 1 dan nilai 2 (input)
            val nilai1 = edt_nilai1.text.toString().toInt()
            val nilai2 = edt_nilai2.text.toString().toInt()

//          hitung proses (nilai 1 + nilai 2)
            val hasil = nilai1 + nilai2

//          tampilkan variabel "hasil" ke edt_hasil
            edt_hasil.setText(hasil.toString())
            edt_hasil.text = Editable.Factory.getInstance().newEditable(hasil.toString())
        }
//      2. untuk btn_reset


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}