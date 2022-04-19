package com.example.finalproject

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (private val context : Activity, private val arrayList: ArrayList<Profile>) : ArrayAdapter<Profile>(context, R.layout.list_item, arrayList){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context);
        val view : View = inflater.inflate(R.layout.list_item, null);

        val imageView : ImageView = view.findViewById(R.id.profile_pic);
        val username : TextView = view.findViewById(R.id.personName);
        val identification : TextView = view.findViewById(R.id.personCode);
        val country : TextView = view.findViewById(R.id.country);
        val date : TextView = view.findViewById(R.id.dateborn);

        imageView.setImageResource(arrayList[position].imageId)
        username.text = arrayList[position].name
        identification.text = arrayList[position].identification
        country.text = arrayList[position].country
        date.text = arrayList[position].dateBorn

        return view
    }

}