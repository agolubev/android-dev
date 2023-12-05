package com.udacity.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentLoginBinding

class FragmentLogin : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false
        )

        binding.signInButton.setOnClickListener {
            findNavController().navigate(FragmentLoginDirections.actionFragmentLoginToBlankFragment())
        }
        binding.signOnButton.setOnClickListener {
            findNavController().navigate(FragmentLoginDirections.actionLoginFragmentToWelcomeFragment())
        }
        return binding.root
    }
}