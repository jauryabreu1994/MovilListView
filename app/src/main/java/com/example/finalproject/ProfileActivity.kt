package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalproject.databinding.ActivityMainBinding
import com.example.finalproject.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var name = intent.getStringExtra("name")
        val identification = intent.getStringExtra("identification")
        val country = intent.getStringExtra("country")
        val date = intent.getStringExtra("date")
        val hobby = intent.getStringExtra("hobby")
        val imageId = intent.getIntExtra("imageId", R.drawable.a)

        binding.editTextName.setText(name)
        binding.editTextIdentification.setText(identification)
        binding.editTextCountry.setText(country)
        binding.editTextDateBorn.setText(date)
        binding.editTextHobby.setText(hobby)
        binding.profileImage.setImageResource(imageId)


    }
}