@file:Suppress("DEPRECATION")

package com.example.tugas_2

import android.os.Bundle
import android.text.Html
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val formattedText = Html.fromHtml(
            "<font color='#808080'>New Member? </font><font color='#0000FF'><u>Register</u></font>"
        )
        binding.txtRegister.text = formattedText

        binding.btnLogin.setOnClickListener {
            val username = binding.etUsername.text.toString()
            if (username.isNotEmpty()) {
                Toast.makeText(this, "Toast $username", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Username tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }
    }
}