package com.gmail.apigeoneer.shoeshop.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.gmail.apigeoneer.shoeshop.R
import com.gmail.apigeoneer.shoeshop.databinding.FragmentInstructionsBinding

class InstructionsFragment : Fragment() {

    // data binding
    private lateinit var binding: FragmentInstructionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_instructions, container, false)

        binding.continueBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_instructionsFragment_to_shoeListFragment)
        }

        return binding.root
    }
}