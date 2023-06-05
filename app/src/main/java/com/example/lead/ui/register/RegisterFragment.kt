package com.example.lead.ui.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lead.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnSignup.setOnClickListener {
                val email = etEmail.text.toString()
                navigateToHome(email)
            }
            labelSignupToLogin.setOnClickListener {
                navigateToLogin()
            }
        }
    }

    private fun navigateToHome(email: String? = null) {
        val direction = if (email != null) {
            RegisterFragmentDirections.actionRegisterFragmentToHomeFragment(email)
        } else {
            RegisterFragmentDirections.actionRegisterFragmentToHomeFragment()
        }
        findNavController().navigate(direction)
    }

    private fun navigateToLogin() {
        val direction = RegisterFragmentDirections.actionRegisterFragmentToLoginFragment()
        findNavController().navigate(direction)
    }
}
