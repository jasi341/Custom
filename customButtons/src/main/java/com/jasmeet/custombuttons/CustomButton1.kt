package com.jasmeet.custombuttons

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat

class CustomButton1(context: Context,attrs:AttributeSet): AppCompatButton(context,attrs) {

    private var mContext = context
    private val a = mContext.obtainStyledAttributes(attrs,R.styleable.CustomButton1)

    //Neutral Primary button Long
    fun primaryButtonLongNeutral() {
        val primaryButtonLong_Neutral = a.getBoolean(R.styleable.CustomButton1_primaryButtonLong_neutral,false)
        setBackgroundResource(R.drawable.btn_neutral)
        setPadding(133,0,133,0)
        invalidate()
    }

    //Clicked Primary button Long
    fun primaryButtonLongClicked() {
        val primaryButtonLong_Clicked = a.getBoolean(R.styleable.CustomButton1_primaryButtonLong_Clicked,false)
        setBackgroundColor(ContextCompat.getColor(context,R.color.orange))
        setPadding(133,0,133,0)
        invalidate()
    }

    //Disabled Primary button Long
    fun primaryButtonLongDisabled() {
        val primaryButtonLong_Disabled = a.getBoolean(R.styleable.CustomButton1_primaryButtonLong_Disabled,false)
        setBackgroundResource(R.drawable.btn_disabled)
        setPadding(133,0,133,0)
        invalidate()
    }

    //Neutral Primary button long icon
    fun primaryButtonLongIconNeutral(){
        val drawableLeftCompat = a.getDrawable(R.styleable.CustomButton1_drawableLeftCompat)
        setBackgroundResource(R.drawable.btn_neutral)
        setPadding(133,0,133,0)
        invalidate()
    }

    //Clicked Primary button long icon
    fun primaryButtonLongIconClicked(){
        val drawableLeftCompat = a.getDrawable(R.styleable.CustomButton1_drawableLeftCompat)
        setBackgroundColor(ContextCompat.getColor(context,R.color.orange))
        setPadding(133,0,133,0)
        invalidate()
    }

    //Disabled Primary button long icon
    fun primaryButtonLongIconDisabled() {
        val drawableLeftCompat = a.getDrawable(R.styleable.CustomButton1_drawableLeftCompat)
        setBackgroundResource(R.drawable.btn_disabled)
        setPadding(133,0,133,0)
        invalidate()
    }

    //Neutral Primary button long tail icon
    fun primaryButtonLongTailIconNeutral(){
        val drawableRightCompat = a.getDrawable(R.styleable.CustomButton1_drawableRightCompat)
        setBackgroundResource(R.drawable.btn_neutral)
        setPadding(133,0,133,0)
        invalidate()
    }

    //CLicked Primary button long tail icon
    fun primaryButtonLongTailIconClicked(){
        val drawableRightCompat = a.getDrawable(R.styleable.CustomButton1_drawableRightCompat)
        setBackgroundColor(ContextCompat.getColor(context,R.color.orange))
        setPadding(133,0,133,0)
        invalidate()
    }

    //Disabled Primary button long tail icon
    fun primaryButtonLongTailIconDisabled(){
        val drawableRightCompat = a.getDrawable(R.styleable.CustomButton1_drawableRightCompat)
        setPadding(133,0,133,0)
        setBackgroundResource(R.drawable.btn_disabled)
        invalidate()
    }

    //Neutral secondary button long
    fun secondaryButtonLongNeutral() {
        val secondaryButtonLong_Neutral = a.getBoolean(R.styleable.CustomButton1_secondaryButtonLong_Neutral,false)
        setBackgroundResource(R.drawable.btn_sec_neutral)
        setPadding(133,0,133,0)
        invalidate()
    }

    //Clicked secondary button long
    fun secondaryButtonLongClicked(){
        val secondaryButtonLong_Clicked = a.getBoolean(R.styleable.CustomButton1_secondaryButtonLong_Clicked,false)
        setBackgroundResource(R.drawable.btn_sec_clicked)
        setPadding(133,0,133,0)
        invalidate()
    }

    //Disabled secondary button long
    fun secondaryButtonLongDisabled(){
        val secondaryButtonLong_Disabled = a.getBoolean(R.styleable.CustomButton1_secondaryButtonLong_Disabled,false)
        setBackgroundResource(R.drawable.btn_sec_disabled)
        setPadding(133,0,133,0)
        invalidate()
    }

    //Neutral secondary button long icon
    fun secondaryButtonLongIconNeutral(){
        val secondaryButtonLong_Neutral = a.getBoolean(R.styleable.CustomButton1_secondaryButtonLong_Neutral,false)
        setBackgroundResource(R.drawable.btn_sec_neutral)
        setPadding(133,0,133,0)
        val drawableLeftCompat = a.getDrawable(R.styleable.CustomButton1_drawableLeftCompat)
        invalidate()
    }

    //Clicked secondary button long icon
    fun secondaryButtonLongIconClicked(){
        val secondaryButtonLong_Clicked= a.getBoolean(R.styleable.CustomButton1_secondaryButtonLong_Clicked,false)
        setBackgroundResource(R.drawable.btn_sec_clicked)
        setPadding(133,0,133,0)
        val drawableLeftCompat = a.getDrawable(R.styleable.CustomButton1_drawableLeftCompat)
        invalidate()
    }

    //Disabled secondary button long icon
    fun secondaryButtonLongIconDisabled(){
        val secondaryButtonLong_Disabled = a.getBoolean(R.styleable.CustomButton1_secondaryButtonLong_Disabled,false)
        setBackgroundResource(R.drawable.btn_sec_disabled)
        setPadding(133,0,133,0)
        val drawableLeftCompat = a.getDrawable(R.styleable.CustomButton1_drawableLeftCompat)
        invalidate()
    }

    //Neutral secondary button long tail icon
    fun secondaryButtonLongTailIconNeutral(){
        val secondaryButtonLongTailNeutral  = a.getBoolean(R.styleable.CustomButton1_primaryButtonLong_neutral,false)
        setBackgroundResource(R.drawable.btn_sec_disabled)
        setPadding(133,0,133,0)
        val drawableRightCompat = a.getDrawable(R.styleable.CustomButton1_drawableRightCompat)
        invalidate()
    }

    //Clicked secondary button long tail icon
    fun secondaryButtonLongTailIconClicked(){
        val secondaryButtonLongTailClicked  = a.getBoolean(R.styleable.CustomButton1_primaryButtonLong_neutral,false)
        setBackgroundResource(R.drawable.btn_sec_clicked)
        setPadding(133,0,133,0)
        val drawableRightCompat = a.getDrawable(R.styleable.CustomButton1_drawableRightCompat)
        invalidate()
    }

    //Disabled secondary button long tail icon
    fun secondaryButtonLongTailIconDisabled(){
        val secondaryButtonLongTail_Disabled = a.getBoolean(R.styleable.CustomButton1_secondaryButtonLong_Disabled,false)
        setBackgroundResource(R.drawable.btn_sec_disabled)
        setPadding(133,0,133,0)
        val drawableRightCompat = a.getDrawable(R.styleable.CustomButton1_drawableRightCompat)
        invalidate()
    }







}