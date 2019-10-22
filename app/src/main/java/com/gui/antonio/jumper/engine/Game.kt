package com.gui.antonio.jumper.engine

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.MotionEvent
import android.view.SurfaceView
import android.view.View
import com.gui.antonio.jumper.R
import com.gui.antonio.jumper.elementos.Cano
import com.gui.antonio.jumper.elementos.Passaro

class Game(context: Context) : SurfaceView(context), Runnable, View.OnTouchListener {

    private var isRunning = true
    private var h = holder
    private var passaro: Passaro? = null
    private var background: Bitmap? = null
    private var tela: Tela? = null
    private var cano: Cano? = null

    init {
        tela = Tela(context)
        inicializaElementos()
        setOnTouchListener(this)
    }

    override fun run() {

        while (isRunning) {

            if (!holder.surface.isValid) continue

            val canvas = h.lockCanvas()

            canvas.drawBitmap(background, 0f, 0f, null)
            passaro?.desenhaNo(canvas)
            passaro?.cai()
            cano?.desenhaNo(canvas)

            holder.unlockCanvasAndPost(canvas)
        }
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        passaro?.pula()
        return false
    }

    fun inicializaElementos() {
        val back = BitmapFactory.decodeResource(resources, R.drawable.background)
        background = Bitmap.createScaledBitmap(back, back.width, tela!!.getAltura(), false)
        passaro = Passaro()
        cano = Cano(tela!!, 200f)
    }

    fun cancel() {
        isRunning = false
    }

    fun start() {
        isRunning = true
    }
}