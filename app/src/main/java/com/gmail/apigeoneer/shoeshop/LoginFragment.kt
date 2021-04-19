package com.gmail.apigeoneer.shoeshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.gmail.apigeoneer.shoeshop.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    // data binding
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        binding.loginBtn.setOnClickListener {
            Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_welcomeFragment)
        }

        return binding.root
    }

}