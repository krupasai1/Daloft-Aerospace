package com.example.daloft

import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.daloft.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
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
    }

    private fun createTrapezoidShape(): GradientDrawable {
        return GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            setColor(resources.getColor(R.color.teal_200, null)) // Set the color you want
            cornerRadii = floatArrayOf(3f, 3f, 3f, 3f, 5f, 5f, 5f, 5f)
            setSize(2, 70) // Set the size you want
        }
    }
}
