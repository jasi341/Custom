package com.jasmeet.custombuttons

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat

class CustomButton1(context: Context,attrs:AttributeSet): AppCompatButton(context,attrs) {
    lateinit var mText: String
    private var mDefaultTextColor =R.color.white
    private var mContext = context
    private val a = mContext.obtainStyledAttributes(attrs,R.styleable.CustomButton1,0,0)

    private var state: State = State.NEUTRAL


    enum class State {
        NEUTRAL,CLICKED,LOADING,DISABLED;
    }

    private fun defaultButton(){
        if (state == State.NEUTRAL){
            normalButton()
        }

    }

    fun normalButton() {
        state = State.CLICKED
        val isNeutral = a.getBoolean(R.styleable.CustomButton1_isNeutral,false)
        setBackgroundResource(R.drawable.btn_neutral)
        invalidate()
    }

    private fun clickedButton(){
        if (state == State.CLICKED){
            clickBtn()
        }
    }

    fun clickBtn() {
        state = State.DISABLED
        val isClicked = a.getBoolean(R.styleable.CustomButton1_isPressed,false)
        setBackgroundColor(ContextCompat.getColor(context,R.color.orange))
        invalidate()
    }

    private fun disabledBtn(){
        if (state == State.DISABLED){
            disBtn()
        }


    }

    fun disBtn() {
        val isDisabled = a.getBoolean(R.styleable.CustomButton1_isDisabled,false)
        setBackgroundResource(R.drawable.btn_disabled)
        invalidate()

    }


}