package com.jasmeet.custom

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jasmeet.custom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.primaryButtonLongNeutral()
        binding.btn1.setOnClickListener {
            binding.btn1.primaryButtonLongDisabled()
            Toast.makeText(this,"hello world",Toast.LENGTH_SHORT).show()
        }

        binding.btn4.primaryButtonLongIconClicked()
        binding.btn2.primaryButtonLongClicked()
        binding.btn3.primaryButtonLongDisabled()


        binding.btn5.primaryButtonLongIconClicked()
        binding.btn6.primaryButtonLongIconDisabled()

        binding.btn7.primaryButtonLongTailIconNeutral()
        binding.btn8.primaryButtonLongTailIconClicked()
        binding.btn9.primaryButtonLongTailIconDisabled()

        binding.btn10.secondaryButtonLongNeutral()
        binding.btn11.secondaryButtonLongClicked()
        binding.btn12.secondaryButtonLongDisabled()

        binding.btn13.secondaryButtonLongIconNeutral()
        binding.btn14.secondaryButtonLongIconClicked()
        binding.btn15.secondaryButtonLongIconDisabled()

        binding.btn16.secondaryButtonLongTailIconNeutral()
        binding.btn17.secondaryButtonLongTailIconClicked()
        binding.btn18.secondaryButtonLongTailIconDisabled()

        binding.btn19.tertiaryButton()
        binding.btn20.tertiaryButton()
        binding.btn21.tertiaryButton()

        binding.btn22.primaryButtonShortNeutral()
        binding.btn23.primaryButtonShortClicked()
        binding.btn24.primaryButtonShortDisabled()

        binding.btn25.secondaryButtonShortNeutral()
        binding.btn26.secondaryButtonShortClicked()
        binding.btn27.secondaryButtonShortDisabled()

        binding.btn.setOnClickListener {
            startActivity(Intent(this,InputFieldsActivity::class.java))
        }

    }
}