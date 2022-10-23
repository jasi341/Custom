package com.jasmeet.custom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jasmeet.custom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      binding.btnNeutral.setOnClickListener {
        //  binding.btnNeutral.normalButton()
          binding.btnNeutral.disBtn()

          Toast.makeText(applicationContext,"Btn clicked",Toast.LENGTH_SHORT).show()

          binding.btnDisabled.visibility = View.GONE
          binding.btnPressed.visibility = View.GONE



      }



    }
}