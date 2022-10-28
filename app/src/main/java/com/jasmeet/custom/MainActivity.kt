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

        binding.btn1.primaryButtonLongNeutral()
        binding.btn2.primaryButtonLongClicked()
        binding.btn3.primaryButtonLongDisabled()

        binding.btn4.primaryButtonLongIconNeutral()
        binding.btn5.primaryButtonLongIconClicked()
        binding.btn6.primaryButtonLongIconDisabled()

        binding.btn7.primaryButtonLongTailIconNeutral()
        binding.btn8.primaryButtonLongTailIconClicked()
        binding.btn9.primaryButtonLongTailIconDisabled()

        binding.btn10.secondaryButtonLongNeutral()
        binding.btn11.secondaryButtonLongClicked()
        binding.btn12.secondaryButtonLongDisabled()


    }
}