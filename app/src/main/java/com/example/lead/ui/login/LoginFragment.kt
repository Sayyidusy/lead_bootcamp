package com.example.lead.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lead.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnSignin.setOnClickListener {
                val username = tilUsername.text.toString()
                navigateToHome(username)
            }
            labelLoginToSignup.setOnClickListener {
                navigateToRegister()
            }
        }
    }

    private fun navigateToHome(username: String? = null) {
        val direction = if (username != null) {
            LoginFragmentDirections.actionLoginFragmentToHomeFragment(username)
        } else {
            LoginFragmentDirections.actionLoginFragmentToHomeFragment()
        }
        findNavController().navigate(direction)
    }

    private fun navigateToRegister() {
        val direction = LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
        findNavController().navigate(direction)
    }
}
