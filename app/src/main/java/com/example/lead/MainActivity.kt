package com.example.lead

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lead.databinding.ActivityLoginBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnSignin.setOnClickListener {
            val username = binding.tilUsername.text.toString()
            val password = binding.tilPassword.text.toString()

            if (username == "admin" && password == "admin") {
                val successMessage = "$username berhasil login"
                showToast(successMessage)
            } else {
                val errorMessage = "Anda gagal login, silahkan coba lagi"
                showToast(errorMessage)
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}


