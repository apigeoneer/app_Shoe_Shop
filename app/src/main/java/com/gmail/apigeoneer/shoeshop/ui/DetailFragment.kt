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
import com.gmail.apigeoneer.shoeshop.databinding.FragmentDetailBinding
import com.gmail.apigeoneer.shoeshop.viewmodels.ShoeListViewModel

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    private lateinit var shoeListViewModel: ShoeListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)

        shoeListViewModel = ViewModelProvider(this).get(ShoeListViewModel::class.java)

        // tell the fragment that data binding is being used
        binding.lifecycleOwner = this

        binding.saveBtn.setOnClickListener {
            shoeListViewModel.addShoe()
            it.findNavController().navigate(R.id.action_detailFragment_to_shoeListFragment)
        }

        binding.cancelBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_detailFragment_to_shoeListFragment)
        }

        return binding.root
    }
}