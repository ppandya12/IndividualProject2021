package com.example.restaurantapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


//adapter class which creates viewHolders and fills data structure with data set
class ExampleAdapter (private val exampleList: List<ExampleItem>) : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.example_item,
        parent, false)

        return ExampleViewHolder(v)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2

    }

    //how many items in the list
    override fun getItemCount(): Int {
        return exampleList.size
    }


    inner class ExampleViewHolder (itemView: View): RecyclerView.ViewHolder (itemView){

        val imageView: ImageView = itemView.findViewById(R.id.classic1)
        val textView1: TextView = itemView.findViewById(R.id.title1)
        val textView2: TextView = itemView.findViewById(R.id.description1)

        init {
            itemView.setOnClickListener{ v: View ->
                val position: Int = adapterPosition
                Toast.makeText(itemView.context,"Added to order", Toast.LENGTH_SHORT).show()
            }
        }

    }
}


