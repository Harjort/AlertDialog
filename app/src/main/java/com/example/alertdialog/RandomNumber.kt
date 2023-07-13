package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class RandomNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        var btnGenerate : Button ?= null
        var ran = ""
        var tvData: TextView ?= null


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_number)

        btnGenerate = findViewById(R.id.btnGenerate)
        tvData = findViewById(R.id.tvData)


        btnGenerate?.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Generate Characters")
            alertDialog.setMessage("Select to generate characters...")
            alertDialog.setCancelable(false)
            alertDialog.setPositiveButton("Generate/Add 3") { _, _ ->
                for (i in 0..2) {
                    val rand1 = ('A'..'Z').random()
                    ran += rand1
                    tvData?.text = ran
                }
            }
            alertDialog.setNegativeButton("Generate/Add 4") { _, _ ->
                for (i in 0..3) {
                    val rand2 = ('A'..'Z').random()
                    ran = ran + rand2
                    tvData?.text = ran
                }
            }
            alertDialog.setNeutralButton("Clear") { _, _ ->
                tvData?.text = "NULL"
                ran = ""
            }
            alertDialog.show()
        }
    }
}

