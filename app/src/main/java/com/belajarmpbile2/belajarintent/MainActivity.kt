package com.belajarmpbile2.belajarintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnPindah : Button
    private lateinit var btnPindah2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPindah = findViewById(R.id.btnPindah)
        btnPindah.setOnClickListener(this)

        btnPindah2 = findViewById(R.id.btnPindah2)
        btnPindah2.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btnPindah -> {
                val pindahIntent = Intent(this@MainActivity,PindahHalaman::class.java)
                startActivity(pindahIntent)
            }
           R.id.btnPindah2 ->{
               val pindahIntent = Intent (this@MainActivity,PindahActivity::class.java)
               startActivity(pindahIntent)
           }
        }
    }
}