package com.gmail.apigeoneer.shoeshop.ui.onboarding

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
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
            // 0-indexing, 2 is actually the 3rd screen
            findNavController().navigate(R.id.action_viewPagerFragment_to_shoeListFragment)
            onBoardingFinished()
        }

        onBoardingFinished()

        return binding.root
    }

    // using a Shared preferences Object to save the value
    private fun onBoardingFinished() {
        // Using LiveTemplate for SharedPreferences
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished",true)
        editor.apply()
    }
}