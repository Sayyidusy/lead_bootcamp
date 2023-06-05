package com.example.lead.ui.login

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lead.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupClickListener()
    }

    private fun setupClickListener() {
        binding.apply {
            btnSignin.setOnClickListener {
                var username = tilEmail.text.toString()
                var password = tilPassword.text.toString()

                var isValid = isValid(username, password)
                if (isValid) {
                    Toast.makeText(
                        this@LoginActivity, "$username login success", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this@LoginActivity, "login failed", Toast.LENGTH_SHORT).show()
                }

            }
        }
    }

    private fun isValid(username: String, password: String): Boolean {
        return username == "Admin" && password == "admin"
    }
}