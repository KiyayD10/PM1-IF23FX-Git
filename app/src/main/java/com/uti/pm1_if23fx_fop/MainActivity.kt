package com.uti.pm1_if23fx_fop

import android.os.Bundle
import android.widget.Button
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

 //       deklarasi variabel object
 //       bentuk variabel
 //       1. Var digunakan untuk variabel yang dapat diubah nilainya. Variabel ini bersifat mutable, artinya dapat diubah atau diperbarui.
 //       2. //Val digunakan untuk variabel yang tidak dapat diubah nilainya. Variabel ini bersifat read-only, artinya hanya dapat dibaca atau diakses nilainya.

        val btn1 : Button = findViewById(R.id.btn_1)
        val btn2 : Button = findViewById(R.id.btn_2)
        val btn3 : Button = findViewById(R.id.btn_3)
        val btn4 : Button = findViewById(R.id.btn_4)
        val btn5 : Button = findViewById(R.id.btn_5)

//        buat event
//        1. event btn1
//        snippetr
        btn1.setOnClickListener {
            Toast.makeText(this@MainActivity,"Tombol 1",Toast.LENGTH_LONG).show()
        }
        btn2.setOnClickListener {
            Toast.makeText(this@MainActivity,"Tombol 2",Toast.LENGTH_LONG).show()
        }
        btn3.setOnClickListener {
            Toast.makeText(this@MainActivity,"Tombol 3",Toast.LENGTH_LONG).show()
        }
        btn4.setOnClickListener {
            Toast.makeText(this@MainActivity,"Tombol 4",Toast.LENGTH_LONG).show()
        }
        btn5.setOnClickListener {
            Toast.makeText(this@MainActivity,"Tombol 5",Toast.LENGTH_LONG).show()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}