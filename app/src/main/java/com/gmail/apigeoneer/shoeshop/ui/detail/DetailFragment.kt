package com.gmail.apigeoneer.shoeshop.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.gmail.apigeoneer.shoeshop.R
import com.gmail.apigeoneer.shoeshop.databinding.FragmentDetailBinding
import com.gmail.apigeoneer.shoeshop.models.Shoe
import com.gmail.apigeoneer.shoeshop.viewmodels.ShoeListViewModel

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private val shoeListViewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)

        // tell the fragment that data binding is being used
        binding.lifecycleOwner = this

//        shoeListViewModel.shoeList.observe(viewLifecycleOwner, Observer {
//            // Update the UI
//
//        })

        binding.shoe = Shoe("", 0.0, "", "")

        binding.saveBtn.setOnClickListener {
            // Add the new shoe entry in the ViewModel
            shoeListViewModel.addShoe()
            it.findNavController().navigate(R.id.action_detailFragment_to_shoeListFragment)
        }

        binding.cancelBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_detailFragment_to_shoeListFragment)
        }

        return binding.root
    }

//    private fun observeData() {
//        shoeListViewModel.shoeList.observe(viewLifecycleOwner, Observer {
//            // Update the UI
//        }
//    }
}