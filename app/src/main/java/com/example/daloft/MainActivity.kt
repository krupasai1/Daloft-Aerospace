package com.example.daloft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.daloft.ui.theme.DaloftTheme
import soup.neumorphism.NeumorphCardView

import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


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