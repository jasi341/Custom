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
        setBackgroundResource(R.drawable.btn_gredient)
        invalidate()
    }

    //Clicked Primary button Long
    fun primaryButtonLongClicked() {
        setBackgroundResource(R.drawable.btn_clicked)
        invalidate()
    }

    //Disabled Primary button Long
    fun primaryButtonLongDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        invalidate()
    }

    //Neutral Primary button long icon
    fun primaryButtonLongIconNeutral(){
        val drawableLeftCompat = a.getDrawable(R.styleable.CustomButton1_drawableLeftCompat)
        setBackgroundResource(R.drawable.btn_gredient)
        setPadding(385,0,385,0)
        invalidate()
    }

    //Clicked Primary button long icon
    fun primaryButtonLongIconClicked(){
        val drawableLeftCompat = a.getDrawable(R.styleable.CustomButton1_drawableLeftCompat)
        setBackgroundResource(R.drawable.btn_clicked)
        setPadding(385,0,385,0)
        invalidate()
    }

    //Disabled Primary button long icon
    fun primaryButtonLongIconDisabled() {
        val drawableLeftCompat = a.getDrawable(R.styleable.CustomButton1_drawableLeftCompat)
        setBackgroundResource(R.drawable.btn_disabled)
        setPadding(385,0,385,0)
        invalidate()
    }

    //Neutral Primary button long tail icon
    fun primaryButtonLongTailIconNeutral(){
        val drawableRightCompat = a.getDrawable(R.styleable.CustomButton1_drawableRightCompat)
        setBackgroundResource(R.drawable.btn_gredient)
        setPadding(385,0,385,0)
        invalidate()
    }

    //CLicked Primary button long tail icon
    fun primaryButtonLongTailIconClicked(){
        val drawableRightCompat = a.getDrawable(R.styleable.CustomButton1_drawableRightCompat)
        setBackgroundResource(R.drawable.btn_clicked)
        setPadding(385,0,385,0)
        invalidate()
    }

    //Disabled Primary button long tail icon
    fun primaryButtonLongTailIconDisabled(){
        val drawableRightCompat = a.getDrawable(R.styleable.CustomButton1_drawableRightCompat)
        setPadding(385,0,385,0)
        setBackgroundResource(R.drawable.btn_disabled)
        invalidate()
    }

    //Neutral secondary button long
    fun secondaryButtonLongNeutral() {
        setBackgroundResource(R.drawable.btn_sec_neutral)
        invalidate()
    }

    //Clicked secondary button long
    fun secondaryButtonLongClicked(){
        setBackgroundResource(R.drawable.btn_sec_clicked)
        invalidate()
    }

    //Disabled secondary button long
    fun secondaryButtonLongDisabled(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        invalidate()
    }

    //Neutral secondary button long icon
    fun secondaryButtonLongIconNeutral(){
        setBackgroundResource(R.drawable.btn_sec_neutral)
        setPadding(385,0,385,0)
        val drawableLeftCompat = a.getDrawable(R.styleable.CustomButton1_drawableLeftCompat)
        invalidate()
    }

    //Clicked secondary button long icon
    fun secondaryButtonLongIconClicked(){
        setBackgroundResource(R.drawable.btn_sec_clicked)
        setPadding(385,0,385,0)
        val drawableLeftCompat = a.getDrawable(R.styleable.CustomButton1_drawableLeftCompat)
        invalidate()
    }

    //Disabled secondary button long icon
    fun secondaryButtonLongIconDisabled(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        setPadding(385,0,385,0)
        val drawableLeftCompat = a.getDrawable(R.styleable.CustomButton1_drawableLeftCompat)
        invalidate()
    }

    //Neutral secondary button long tail icon
    fun secondaryButtonLongTailIconNeutral(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        setPadding(385,0,385,0)
        val drawableRightCompat = a.getDrawable(R.styleable.CustomButton1_drawableRightCompat)
        invalidate()
    }

    //Clicked secondary button long tail icon
    fun secondaryButtonLongTailIconClicked(){
        setBackgroundResource(R.drawable.btn_sec_clicked)
        setPadding(385,0,385,0)
        val drawableRightCompat = a.getDrawable(R.styleable.CustomButton1_drawableRightCompat)
        invalidate()
    }

    //Disabled secondary button long tail icon
    fun secondaryButtonLongTailIconDisabled(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        setPadding(385,0,385,0)
        val drawableRightCompat = a.getDrawable(R.styleable.CustomButton1_drawableRightCompat)
        invalidate()
    }

    //can be used for all kinds of tertiary buttons
    fun tertiaryButton(){
        setBackgroundResource(R.drawable.btn_trans)
        setPadding(385,0,385,0)
        val drawableRightCompat = a.getDrawable(R.styleable.CustomButton1_drawableRightCompat)
        invalidate()
    }

    //primary Button short neutral
    fun primaryButtonShortNeutral(){
        setBackgroundResource(R.drawable.btn_gredient)
        invalidate()
    }

    //Clicked Primary button short
    fun primaryButtonShortClicked() {
        setBackgroundResource(R.drawable.btn_clicked)
        invalidate()
    }

    //Disabled Primary button short
    fun primaryButtonShortDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        invalidate()
    }

    //Neutral secondary button short
    fun secondaryButtonShortNeutral() {
        setBackgroundResource(R.drawable.btn_sec_neutral)
        invalidate()
    }

    //Clicked secondary button short
    fun secondaryButtonShortClicked(){
        setBackgroundResource(R.drawable.btn_sec_clicked)
        invalidate()
    }

    //Disabled secondary button short
    fun secondaryButtonShortDisabled(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        invalidate()
    }
}