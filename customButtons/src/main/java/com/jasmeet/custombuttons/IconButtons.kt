package com.jasmeet.custombuttons

import android.content.Context
import android.graphics.Color.BLACK
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton

class IconButtons(context: Context,attrs:AttributeSet) : MaterialButton(context,attrs) {

    private var mContext = context
    private val a = mContext.obtainStyledAttributes(R.styleable.IconButtons)


    //Neutral Primary button long icon
    fun primaryButtonLongIconNeutral(){
        val drawableLeftCompat = a.getDrawable(R.styleable.WithoutIconButton_drawableLeftCompat)
        setTextColor( resources.getColor(R.color.white))
        setBackgroundResource(R.drawable.btn_gredient)
        iconGravity = ICON_GRAVITY_TEXT_START
        textSize = 18f
        setIconTintResource(R.color.white)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Clicked Primary button long icon
    fun primaryButtonLongIconClicked(){
        setTextColor( resources.getColor(R.color.white))
        setBackgroundResource(R.drawable.btn_clicked)
        iconGravity = ICON_GRAVITY_TEXT_START
        textSize = 18f
        setIconTintResource(R.color.white)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Disabled Primary button long icon
    fun primaryButtonLongIconDisabled() {
        setBackgroundResource(R.drawable.btn_disabled)
        iconGravity = ICON_GRAVITY_TEXT_START
        textSize = 18f
        setIconTintResource(R.color.disabled_text)
        textAlignment = TEXT_ALIGNMENT_CENTER
        setTextColor( resources.getColor(R.color.disabled_text))
        invalidate()
    }

    //Neutral Primary button long tail icon
    fun primaryButtonLongTailIconNeutral(){
        setBackgroundResource(R.drawable.btn_gredient)
        setTextColor( resources.getColor(R.color.white))
        iconGravity = ICON_GRAVITY_TEXT_END
        textSize = 18f
        setIconTintResource(R.color.white)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //CLicked Primary button long tail icon
    fun primaryButtonLongTailIconClicked(){
        setBackgroundResource(R.drawable.btn_clicked)
        setTextColor( resources.getColor(R.color.white))
        iconGravity = ICON_GRAVITY_TEXT_END
        textSize = 18f
        setIconTintResource(R.color.white)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Disabled Primary button long tail icon
    fun primaryButtonLongTailIconDisabled(){
        setBackgroundResource(R.drawable.btn_disabled)
        iconGravity = ICON_GRAVITY_TEXT_END
        textSize = 18f
        setIconTintResource(R.color.disabled_text)
        textAlignment = TEXT_ALIGNMENT_CENTER
        setTextColor( resources.getColor(R.color.disabled_text))
        invalidate()
    }


    //Neutral secondary button long icon
    fun secondaryButtonLongIconNeutral(){
        setBackgroundResource(R.drawable.btn_sec_neutral)
        setTextColor( resources.getColor(R.color.orange))
        iconGravity = ICON_GRAVITY_TEXT_START
        textSize = 18f
        setIconTintResource(R.color.orange)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Clicked secondary button long icon
    fun secondaryButtonLongIconClicked(){
        setBackgroundResource(R.drawable.btn_sec_clicked)
        setTextColor( resources.getColor(R.color.orange))
        iconGravity = ICON_GRAVITY_TEXT_START
        textSize = 18f
        setIconTintResource(R.color.orange)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Disabled secondary button long icon
    fun secondaryButtonLongIconDisabled(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        setTextColor( resources.getColor(R.color.disabled_text))
        iconGravity = ICON_GRAVITY_TEXT_START
        textSize = 18f
        setIconTintResource(R.color.disabled_text)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Neutral secondary button long tail icon
    fun secondaryButtonLongTailIconNeutral(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        setTextColor( resources.getColor(R.color.orange))
        iconGravity = ICON_GRAVITY_TEXT_END
        textSize = 18f
        setIconTintResource(R.color.orange)
        textAlignment = TEXT_ALIGNMENT_CENTER
        invalidate()
    }

    //Clicked secondary button long tail icon
    fun secondaryButtonLongTailIconClicked(){
        iconGravity = ICON_GRAVITY_TEXT_END
        textSize = 18f
        setIconTintResource(R.color.orange)
        textAlignment = TEXT_ALIGNMENT_CENTER
        setTextColor( resources.getColor(R.color.orange))
        setBackgroundResource(R.drawable.btn_sec_clicked)
        invalidate()
    }

    //Disabled secondary button long tail icon
    fun secondaryButtonLongTailIconDisabled(){
        setBackgroundResource(R.drawable.btn_sec_disabled)
        iconGravity = ICON_GRAVITY_TEXT_END
        textSize = 18f
        setIconTintResource(R.color.disabled_text)
        textAlignment = TEXT_ALIGNMENT_CENTER
        setTextColor( resources.getColor(R.color.disabled_text))
        invalidate()
    }

}