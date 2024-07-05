package com.example.skillfactoryproject

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.skillfactoryproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }*/

binding.button1.setOnClickListener{
    Toast.makeText(this,"Меню",Toast.LENGTH_SHORT).show()
}
        binding.button2.setOnClickListener{
            Toast.makeText(this,"Избранное",Toast.LENGTH_SHORT).show()
        }
        binding.button3.setOnClickListener{
            Toast.makeText(this,"Посмотреть позже",Toast.LENGTH_SHORT).show()
        }
        binding.button4.setOnClickListener{
            Toast.makeText(this,"Подборки",Toast.LENGTH_SHORT).show()
        }
        binding.button5.setOnClickListener{
            Toast.makeText(this,"Настройки",Toast.LENGTH_SHORT).show()
        }
    }

    }

