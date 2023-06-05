package com.example.lead.ui.login_selector

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.lead.databinding.FragmentLoginSelectorBinding

class LoginSelectorFragment : Fragment() {
    private lateinit var binding: FragmentLoginSelectorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginSelectorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnSignin.setOnClickListener {
                navigateTo(LoginSelectorFragmentDirections.actionLoginSelectorFragmentToLoginFragment())
            }
            btnSignup.setOnClickListener {
                navigateTo(LoginSelectorFragmentDirections.actionLoginSelectorFragmentToRegisterFragment())
            }
        }
    }

    private fun navigateTo(direction: NavDirections) {
        findNavController().navigate(direction)
    }
}
