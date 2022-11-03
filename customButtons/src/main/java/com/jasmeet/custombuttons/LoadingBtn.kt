package com.jasmeet.custombuttons

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.core.view.setPadding
import com.airbnb.lottie.LottieAnimationView

class LoadingBtn(context: Context, attrs:AttributeSet):LottieAnimationView(context,attrs) {

    private var mContext = context
    private var  a = mContext.obtainStyledAttributes(attrs,R.styleable.LoadingBtn)

    fun loadingBtn(){
        setPadding(0,10,10,0)
        val lottieRes = a.resources.openRawResource(R.raw.loader)
        val loop = a.getBoolean(R.styleable.LoadingBtn_lottie_loop, true)
        val autoPlay = a.getBoolean(R.styleable.LoadingBtn_lottie_autoPlay,true)


    }



}