package com.gui.antonio.jumper

import android.app.Activity
import android.os.Bundle
import com.gui.antonio.jumper.engine.Game
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    private var game: Game? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        game = Game(this)
        container.addView(game)
    }

    override fun onPause() {
        super.onPause()
        game?.cancel()
    }

    override fun onResume() {
        super.onResume()
        game?.start()
        Thread(game).start()
    }


}
