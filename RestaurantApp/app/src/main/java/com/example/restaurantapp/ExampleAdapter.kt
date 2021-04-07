package com.example.restaurantapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
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

    // Replace the contents of a view
    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]
        //defining elements using view holder object
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2
        holder.textView3.text = currentItem.text3
        holder.imageButton.setImageResource(R.drawable.ic_add)
    }

    //how many items in the list
    override fun getItemCount(): Int {
        return exampleList.size
    }


    inner class ExampleViewHolder (itemView: View): RecyclerView.ViewHolder (itemView){

        //items in the card
        val imageView: ImageView = itemView.findViewById(R.id.classic1)
        val textView1: TextView = itemView.findViewById(R.id.title1)
        val textView2: TextView = itemView.findViewById(R.id.description1)
        val textView3: TextView = itemView.findViewById(R.id.price)
        val imageButton: ImageButton = itemView.findViewById(R.id.imageAdd)

        //when button is clicked toast message should be displayed
        init {
            imageButton.setOnClickListener{ v: View ->
                val v: Int = adapterPosition
                Toast.makeText(itemView.context,"Added to order", Toast.LENGTH_SHORT).show()
            }
        }

    }
}


