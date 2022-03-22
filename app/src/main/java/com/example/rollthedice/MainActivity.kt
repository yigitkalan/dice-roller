package com.example.rollthedice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollTheDice()
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    private fun rollTheDice() {
        val dice = Dice(6)
        val resultNumber = dice.roll()
        val resultNumber2 = dice.roll()

        val iv1 : ImageView = findViewById(R.id.dice1)
        val iv2 : ImageView = findViewById(R.id.dice2)

        when(resultNumber){
            1-> iv1.setImageResource(R.drawable.dice_1)
            2-> iv1.setImageResource(R.drawable.dice_2)
            3-> iv1.setImageResource(R.drawable.dice_3)
            4-> iv1.setImageResource(R.drawable.dice_4)
            5-> iv1.setImageResource(R.drawable.dice_5)
            6-> iv1.setImageResource(R.drawable.dice_6)
        }
        when(resultNumber2){
            1-> iv2.setImageResource(R.drawable.dice_1)
            2-> iv2.setImageResource(R.drawable.dice_2)
            3-> iv2.setImageResource(R.drawable.dice_3)
            4-> iv2.setImageResource(R.drawable.dice_4)
            5-> iv2.setImageResource(R.drawable.dice_5)
            6-> iv2.setImageResource(R.drawable.dice_6)
        }

    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}