package com.gui.antonio.jumper.engine

import android.content.Context
import android.util.DisplayMetrics
import android.view.WindowManager

class Tela(context: Context) {

    private var metrics: DisplayMetrics? = null

    init {
        val wm = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val display = wm.defaultDisplay
        metrics = DisplayMetrics()
        display.getMetrics(metrics)
    }

    fun getAltura(): Int {
        return metrics!!.heightPixels
    }
}