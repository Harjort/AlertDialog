package com.example.alertdialog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var tvNumber: TextView?= null
        var btnAlert: Button?= null
        var num = 0
        var btnNext: Button ?=null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAlert = findViewById(R.id.btnAlert)
        tvNumber = findViewById(R.id.tvNumber)
        btnNext = findViewById(R.id.btnNext)

       btnAlert.setOnClickListener {

            val alert = AlertDialog.Builder(this)
            alert.setTitle("Testing Alert")
           alert.setMessage("select an action")
            alert.setCancelable(false)
            alert.setPositiveButton("Add") { _,_ ->
                Toast.makeText(this, "2 Added", Toast.LENGTH_LONG).show()
                num += 2
                tvNumber.text=num.toString()
            }
            alert.setNegativeButton("Sub") { _,_ ->
                Toast.makeText(this, "2 Subtracted", Toast.LENGTH_LONG).show()
                num -= 2
                tvNumber.text=num.toString()
            }
            alert.setNeutralButton("Clear") { _,_ ->
                Toast.makeText(this, "Cleared", Toast.LENGTH_LONG).show()
                num = 0
                tvNumber.text=num.toString()
            }
          alert.show()
        }

        btnNext?.setOnClickListener{
            val intent = Intent(this, RandomNumber::class.java)
            startActivity(intent)
        }

    }


    }
