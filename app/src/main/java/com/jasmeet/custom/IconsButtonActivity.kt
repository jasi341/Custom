package com.jasmeet.custom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jasmeet.custom.databinding.ActivityIconsButtonBinding

class IconsButtonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIconsButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIconsButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn1.primaryButtonLongIconNeutral()
        binding.btn2.primaryButtonLongIconClicked()
        binding.btn3.primaryButtonLongIconDisabled()

        binding.btn4.primaryButtonLongTailIconNeutral()
        binding.btn5.primaryButtonLongTailIconClicked()
        binding.btn6.primaryButtonLongTailIconDisabled()

        binding.btn7.secondaryButtonLongIconNeutral()
        binding.btn8.secondaryButtonLongIconClicked()
        binding.btn9.secondaryButtonLongIconDisabled()

        binding.btn10.secondaryButtonLongTailIconNeutral()
        binding.btn11.secondaryButtonLongTailIconClicked()
        binding.btn12.secondaryButtonLongTailIconDisabled()


        binding.btn15.secondaryButtonLongTailIconDisabled()
        binding.btn14.secondaryButtonLongTailIconNeutral()


        binding.btn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}