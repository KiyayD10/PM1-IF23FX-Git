package com.uti.pm1_if23fx_fop

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Lat2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lat2)

//      deklarasi variabel komponen
        val btn_menu1 = findViewById<Button>(R.id.btn_menu1)
        val btn_menu2 = findViewById<Button>(R.id.btn_menu2)
        val btn_uti = findViewById<Button>(R.id.btn_uti)

//      buat event
//      1. event btn_menu1
        btn_menu1.setOnClickListener {
//          buat variabel intent
            val intent = Intent(this, MainActivity::class.java)
//          buka activity
            startActivity(intent)
        }

//      2. event btn_menu2
        btn_menu2.setOnClickListener {
//          buat variabel intent
            val intent = Intent(this, Lat1Activity::class.java)
//          buka activity
            startActivity(intent)
        }

//      3. event btn_uti
            btn_uti.setOnClickListener {
                val url = "https://teknokrat.ac.id"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)


            }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }