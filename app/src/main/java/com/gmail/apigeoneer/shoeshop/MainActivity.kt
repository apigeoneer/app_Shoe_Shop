package com.gmail.apigeoneer.shoeshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var clAllShoes: ConstraintLayout
    private lateinit var rvBoard: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clAllShoes = findViewById(R.id.all_shoes_constraint_layout)
        rvBoard = findViewById(R.id.board_recycler_view)

        // params: context & #columns
        rvBoard.adapter = ShoeBoardAdapter(this, 2)
        rvBoard.setHasFixedSize(true)
        rvBoard.layoutManager = GridLayoutManager(this, 2)
    }
}