package com.gunjan.personalportfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Projects : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)
        val project1 = findViewById<Button>(R.id.flyingfishgame)
        project1.setOnClickListener {
            val url = "https://github.com/gunjanverma0405/FlyingFishAndroidGame"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
        val project2 = findViewById<Button>(R.id.portfolioflutter)
        project2.setOnClickListener {
            val url = "https://github.com/gunjanverma0405/Portfolio-App"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
        val project3 = findViewById<Button>(R.id.portfoliokotlin)
        project3.setOnClickListener {
            val url = "https://github.com/gunjanverma0405/portfolio_app"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
        val project4 = findViewById<Button>(R.id.india75filter)
        project4.setOnClickListener {
            val url = "https://github.com/gunjanverma0405/India-75-Filter"
            val urlIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse(url)
            )
            startActivity(urlIntent)
        }
    }
}