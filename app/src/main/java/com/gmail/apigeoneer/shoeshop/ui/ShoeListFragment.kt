package com.gmail.apigeoneer.shoeshop.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.gmail.apigeoneer.shoeshop.R
import com.gmail.apigeoneer.shoeshop.databinding.FragmentShoeListBinding
import com.gmail.apigeoneer.shoeshop.databinding.ShoeItemBinding
import com.gmail.apigeoneer.shoeshop.models.Shoe
import com.gmail.apigeoneer.shoeshop.viewmodels.ShoeListViewModel

class ShoeListFragment : Fragment() {

    // data binding
    private lateinit var binding: FragmentShoeListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_shoe_list, container, false)

        // inflate the shoe list item
        val shoeListItem: ShoeItemBinding = DataBindingUtil.inflate(inflater, R.layout.shoe_item, container, false)

        binding.fab.setOnClickListener {
            it.findNavController().navigate(R.id.action_shoeListFragment_to_detailFragment)
        }

        return binding.root
    }

}