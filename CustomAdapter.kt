package com.example.order

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val resim :Array<Int>,val text:Array<String>): RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {
    class CustomViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
   fun bindValue(resim :Int,text:String){
       itemView.findViewById<ImageView>(R.id.imageView).setImageResource(resim)
       itemView.findViewById<TextView>(R.id.text1).text=text

   }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
       val v=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return CustomViewHolder(v)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindValue(resim[position],text[position])
    }

    override fun getItemCount(): Int {
return resim.size
    }
}