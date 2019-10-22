package com.gui.antonio.jumper.elementos

import android.graphics.Canvas
import com.gui.antonio.jumper.engine.Cores
import com.gui.antonio.jumper.engine.Tela

class Cano(val tela: Tela, val posicao: Float) {

    private val TAMANHO_DO_CANO = 250f
    private val LARGURA_DO_CANO = 100f
    private var alturaDoCanoInferior: Float? = null
    private val VERDE = Cores.getCorDoCano()

    init {
        alturaDoCanoInferior = tela.getAltura() - TAMANHO_DO_CANO
    }

    fun desenhaNo(canvas: Canvas) {
        desenhaCanoInferiorNo(canvas)
    }

    private fun desenhaCanoInferiorNo(canvas: Canvas) {
        canvas.drawRect(posicao, alturaDoCanoInferior!!, posicao + LARGURA_DO_CANO, tela.getAltura().toFloat(), VERDE)
    }
}