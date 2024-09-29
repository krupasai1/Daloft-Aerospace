package com.example.daloft

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.daloft.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Binding the activity with the layout using view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set a listener for SwitchCompat (swOnOff)
        binding.swOnOff.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Switch is turned ON
                // Handle the logic when the switch is ON
                binding.swOnOff.text = ""
                Toast.makeText(this, "Auto Pilot Mode Enabled", Toast.LENGTH_SHORT).show()
            } else {
                // Switch is turned OFF
                // Handle the logic when the switch is OFF
                binding.swOnOff.text = ""
                Toast.makeText(this, "Auto Pilot Mode Disabled", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
