package com.example.linearlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.linearlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var tvhello: TextView? = null
    var tvPleaseenteryourname: TextView? = null
    var etname: EditText? = null
    var tvPleaseEnteryourCollegeName: TextView? = null
    var etCollegename: EditText? = null
    var tvsomethingaboutcollege: TextView? = null
    var etsomethingaboutyourcollege: EditText? = null
    var btnsubmit: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        etname = findViewById(R.id.etname)
        etCollegename = findViewById(R.id.etCollegename)
        etsomethingaboutyourcollege = findViewById(R.id.etsomethingaboutyourcollege)
        tvhello = findViewById(R.id.tvhello)
        tvPleaseenteryourname = findViewById(R.id.tvPleaseenteryourname)
        tvPleaseEnteryourCollegeName = findViewById(R.id.tvPleaseEnteryourCollegeName)
        tvsomethingaboutcollege = findViewById(R.id.tvsomethingaboutcollege)
        btnsubmit = findViewById(R.id.btnsubmit)



        binding?.btnsubmit?.setOnClickListener {
          //  var intent = Intent(this, MainActivity::class.java)
           // startActivity(intent)
            Toast.makeText(this, "sumbitted", Toast.LENGTH_SHORT).show()
        }
    }
}