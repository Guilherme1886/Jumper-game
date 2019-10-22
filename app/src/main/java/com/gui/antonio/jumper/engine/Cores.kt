package com.gui.antonio.jumper.engine

import android.graphics.Paint

class Cores {

    companion object {
        fun getCorDoPassaro(): Paint {
            val vermelho = Paint()
            vermelho.color = 0xFFFF0000.toInt()
            return vermelho
        }

        fun getCorDoCano(): Paint {
            val verde = Paint()
            verde.color = 0xFF00FF00.toInt()
            return verde
        }
    }


}