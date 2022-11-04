package com.jasmeet.custom

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.jasmeet.custom.databinding.ActivityTransitionBinding
import java.util.*


class TransitionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTransitionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTransitionBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btn1.primaryButtonLongIconNeutral()

      //post delay of 5 sec after button is clicked

        binding.btn1.setOnClickListener {
           binding.btn1.primaryButtonLongIconClicked()


            binding.btn1.postDelayed({
                binding.btn2.visibility = View.VISIBLE
                binding.btn1.visibility = View.GONE
            }, 800)

                binding.btn1.postDelayed({
                binding.btn1.visibility = android.view.View.VISIBLE
                binding.btn1.primaryButtonLongIconDisabled()
                binding.btn2.visibility= android.view.View.GONE
            }, 2000)
        }

    }
}