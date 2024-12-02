package com.jihan.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.lifecycleScope
import com.jihan.app.model.Game
import com.jihan.app.ui.SnakeGame
import com.jihan.app.ui.theme.AppTheme


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        val game = Game(lifecycleScope)
        setContent {
            AppTheme {
                SnakeGame(game)
            }
        }
    }

}





