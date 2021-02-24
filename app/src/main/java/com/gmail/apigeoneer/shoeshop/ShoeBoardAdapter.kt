package com.gmail.apigeoneer.shoeshop

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ShoeBoardAdapter(
    private val context: Context,
    private val boardSize: Int
) : RecyclerView.Adapter<ShoeBoardAdapter.ViewHolder>() {

    companion object {
        private const val TAG = "ShoeBoardAdapter"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.shoe_card, parent, false)
        val layoutParams = view.findViewById<ConstraintLayout>(R.id.shoe_constraint_layout).layoutParams

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = 10

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val clShoe = itemView.findViewById<ConstraintLayout>(R.id.shoe_constraint_layout)

        fun bind(position: Int) {
            clShoe.setOnClickListener {
                Log.i(TAG, "Clicked on position $position")
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }
}


