package com.example.viewbindingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbindingapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private var cValue = 10
    private var dValue = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.Tv.text = "$cValue"

        binding.btn.setOnClickListener {

            cValue++

            binding.Tv.text = "$cValue"

        }
        binding.btn2.setOnClickListener {

            dValue--

            binding.Tv.text = "$dValue"

        }

    }
}