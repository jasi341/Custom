package com.jasmeet.custom


import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jasmeet.custom.databinding.ActivityInputFieldsBinding

class InputFieldsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInputFieldsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputFieldsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mobilePattern = "[0-9]{10}"

       binding.button.setOnClickListener {

           val mobile =binding.textInputEditText.text.toString()

           if (mobile=="sjasmeet438@gmail.com"){
               binding.textField.error= getString(R.string.save_it)
           }

           if((mobile.matches(mobilePattern.toRegex()))){
               binding.textField.error=null
              Toast.makeText(this,"Valid number" ,Toast.LENGTH_SHORT).show()

           }

       }
    }
}