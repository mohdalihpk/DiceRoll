package com.mads.ali.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRollDice = findViewById<Button>(R.id.btn_dice_roll)
        var dice = findViewById<ImageView>(R.id.dice)

        btnRollDice.text = "Let's Roll"

        btnRollDice.setOnClickListener{
            val randomInt = Random().nextInt(6)+1
            val drawableResource = when(randomInt){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            dice.setImageResource(drawableResource)
        }
    }
}
