package com.gmail.apigeoneer.shoeshop.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.gmail.apigeoneer.shoeshop.R
import com.gmail.apigeoneer.shoeshop.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    // data binding
    private lateinit var binding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_welcome, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.view_pager)

        binding.continueBtn.setOnClickListener {
//            it.findNavController().navigate(R.id.action_welcomeFragment_to_instructionsFragment)
            viewPager?.currentItem = 1
        }
        return binding.root
    }

}