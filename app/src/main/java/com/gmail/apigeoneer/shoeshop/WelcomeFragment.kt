package com.gmail.apigeoneer.shoeshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
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

        binding.continueBtn.setOnClickListener {
            Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_shoeListFragment)
        }
        return binding.root
    }

}