package com.gui.antonio.jumper.elementos

import android.graphics.Canvas
import com.gui.antonio.jumper.engine.Cores

class Passaro {

    val X = 100f
    val RAIO = 50f

    var altura = 0f

    val VERMELHO = Cores.getCorDoPassaro()

    init {
        altura = 100f
    }

    fun desenhaNo(canvas: Canvas) {
        canvas.drawCircle(X, altura, RAIO, VERMELHO)
    }

    fun cai() {
        altura += 5
    }

    fun pula() {
        altura -= 150
    }

}