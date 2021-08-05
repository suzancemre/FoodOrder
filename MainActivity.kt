package com.example.order

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
     private val resim= arrayOf(R.drawable.hamburger_food,R.drawable.kebab_food,R.drawable.kitchen_food,R.drawable.pizza_food,R.drawable.salad_food,R.drawable.ft4,R.drawable.ft2)

    private val text= arrayOf("Hamburger","Kebab","Kitchen","Pizza","Salad","Fried Kitchen","Macaroni")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView=findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter=CustomAdapter(resim,text)
    }
}