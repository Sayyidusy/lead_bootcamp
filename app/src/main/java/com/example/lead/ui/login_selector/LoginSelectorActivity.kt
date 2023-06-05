package com.example.lead.ui.login_selector

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lead.R
import com.example.lead.databinding.ActivityLoginSelectorBinding
import com.example.lead.ui.login.LoginActivity
import com.example.lead.ui.register.RegisterActivity


class LoginSelectorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginSelectorBinding // Deklarasikan variabel binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inisialisasi binding
        binding = ActivityLoginSelectorBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Menambahkan pendengar klik pada btn_signin
        binding.btnSignin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // Menambahkan pendengar klik pada btn_signup
        binding.btnSignup.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}