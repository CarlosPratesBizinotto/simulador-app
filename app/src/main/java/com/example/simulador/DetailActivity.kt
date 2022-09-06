package com.example.simulador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simulador.databinding.ActivityDetailBinding
import com.example.simulador.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}