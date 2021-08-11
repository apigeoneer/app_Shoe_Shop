package com.gmail.apigeoneer.shoeshop.ui

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
import androidx.viewpager2.widget.ViewPager2
import com.gmail.apigeoneer.shoeshop.R
import com.gmail.apigeoneer.shoeshop.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    // data binding
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_login, container, false)

        binding.loginBtn.setOnClickListener {
            if (onBoardingFinished()) {
                it.findNavController().navigate(R.id.action_loginFragment_to_shoeListFragment)
            } else {
                it.findNavController().navigate(R.id.action_loginFragment_to_viewPagerFragment)
            }
        }

        binding.registerBtn.setOnClickListener {
            if (onBoardingFinished()) {
                it.findNavController().navigate(R.id.action_loginFragment_to_shoeListFragment)
            } else {
                it.findNavController().navigate(R.id.action_loginFragment_to_viewPagerFragment)
            }
        }

        return binding.root
    }

    private fun onBoardingFinished(): Boolean {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished", false)
    }

}