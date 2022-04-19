package com.example.finalproject

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var profileArrayList : ArrayList<Profile>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(R.drawable.a, R.drawable.b, R.drawable.c)
        val name = arrayOf("Jaury Abreu", "Helen Peralta", "Norman Olivo")
        val identification = arrayOf("2018-30-3-0028", "2018-30-1-0024", "2019-30-3-0011")
        val date = arrayOf("07/10/1994", "14/03/2001", "23/08/1998")
        val hobby = arrayOf("Beisbol & Video Juegos", " Lectura y Peliculas", "Paintball y Baloncesto")
        val country = arrayOf("Monte Plata, Rep. Dom.", "Santo Domingo, Rep. Dom.", "Santo Domingo, Rep. Dom.")

        profileArrayList = ArrayList()

        for (i in name.indices)
        {
            val profile = Profile(name[i], identification[i], country[i], date[i], hobby[i], imageId[i])
            profileArrayList.add(profile)
        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this, profileArrayList)
        binding.listview.setOnItemClickListener{parent, view, position, id ->
            val name = name[position]
            val identification = identification[position]
            val country = country[position]
            val date = date[position]
            val hobby = hobby[position]
            val imageId = imageId[position]

            val i = Intent(this, ProfileActivity::class.java)
            i.putExtra("name", name)
            i.putExtra("identification", identification)
            i.putExtra("country", country)
            i.putExtra("date", date)
            i.putExtra("hobby", hobby)
            i.putExtra("imageId", imageId)
            startActivity(i)

        }
    }
}