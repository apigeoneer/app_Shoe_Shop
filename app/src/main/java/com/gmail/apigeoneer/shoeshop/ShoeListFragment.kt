package com.gmail.apigeoneer.shoeshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.gmail.apigeoneer.shoeshop.databinding.FragmentShoeListBinding

class ShoeListFragment : Fragment() {

    // data binding
    private lateinit var binding: FragmentShoeListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)

        // params: context & #columns
        binding.boardRecyclerView.adapter = ShoeBoardAdapter(this, 2)
        binding.boardRecyclerView.setHasFixedSize(true)
        binding.boardRecyclerView.layoutManager = GridLayoutManager(binding.root.context, 2)   // context (act) -> binding.root.context (frag)

        return binding.root
    }

}