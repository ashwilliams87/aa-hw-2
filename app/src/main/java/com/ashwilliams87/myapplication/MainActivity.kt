package com.ashwilliams87.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView: TextView = findViewById(R.id.meetup_author)
//        textView.setOnClickListener {view ->
//            val intent = Intent(this@MainActivity, AuthorActivity::class.java)
//            intent.putExtra("key", "Kotlin")
//            startActivity(intent)
//        }

        textView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, AuthorActivity::class.java)
                intent.putExtra("key", "Kotlin")
                startActivity(intent)
            }
        })
    }
}
