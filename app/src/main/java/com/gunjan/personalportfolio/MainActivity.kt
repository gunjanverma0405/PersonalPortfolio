package com.gunjan.personalportfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val projects = findViewById<Button>(R.id.buttonProjects)
        projects.setOnClickListener {
            val intent = Intent(this, Projects::class.java)
            startActivity(intent)
        }
        val resume = findViewById<Button>(R.id.buttonCV)
        resume.setOnClickListener {
            val url = "https://drive.google.com/file/d/1kM5CQYGTwKoE1v3B34YIpjYQNygN6_u9/view?usp=share_link"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
        val email = findViewById<Button>(R.id.buttonEmail)
        email.setOnClickListener {
            val url = "mailto:gunjanverma0412@gmail.com"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
        val github = findViewById<ImageView>(R.id.imageView1)
        github.setOnClickListener {
            val url = "https://github.com/gunjanverma0405"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
        val linkedin = findViewById<ImageView>(R.id.imageView2)
        linkedin.setOnClickListener {
            val url = "https://www.linkedin.com/in/gunjan-verma-4952a51a0"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
    }
}