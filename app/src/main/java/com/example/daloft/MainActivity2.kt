package com.example.daloft

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.daloft.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        // Handle menubutton click
        binding.menubutton?.setOnClickListener {
            if (binding.buttonCard?.visibility == View.VISIBLE) {
                binding.buttonCard?.visibility = View.GONE
                binding.menubutton!!.setImageResource(R.drawable.ic_right_arrow)
            } else {
                binding.buttonCard!!.visibility = View.VISIBLE
                binding.menubutton!!.setImageResource(R.drawable.ic_left_arrow)
            }
        }

        // Handle menubutton2 click
        binding.menubutton2?.setOnClickListener {
            if (binding.buttonCard2?.visibility == View.VISIBLE) {
                binding.buttonCard2?.visibility = View.GONE
                binding.menubutton2!!.setImageResource(R.drawable.ic_left_arrow)
            } else {
                binding.buttonCard2!!.visibility = View.VISIBLE
                binding.menubutton2!!.setImageResource(R.drawable.ic_right_arrow)
            }
        }

        toggleButtonTintOnClick(binding.bList as ImageButton, "#90657369", "#983873ed")
        toggleButtonTintOnClick(binding.bConnect as ImageButton, "#90F44336", "#983873ed")
        toggleButtonTintOnClick(binding.startButton as ImageButton, "#90657369", "#983873ed")
        toggleButtonTintOnClick(binding.startWp as ImageButton, "#9863509e", "#983873ed")
        toggleButtonTintOnClick(binding.missionStart as ImageButton, "#98a64d4b", "#983873ed")
        toggleButtonTintOnClick(binding.autopilot as ImageButton, "#9863509e", "#983873ed")
    }
}

fun toggleButtonTintOnClick(imageButton: ImageButton, color1: String, color2: String) {
    var isDefaultColor = true
    val defaultTintColor = Color.parseColor(color1)
    val newTintColor = Color.parseColor(color2)

    imageButton.setOnClickListener {
        if (isDefaultColor) {
            imageButton.backgroundTintList = ColorStateList.valueOf(newTintColor)
        } else {
            imageButton.backgroundTintList = ColorStateList.valueOf(defaultTintColor)
        }
        isDefaultColor = !isDefaultColor
    }
}



