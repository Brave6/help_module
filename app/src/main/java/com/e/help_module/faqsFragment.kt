package com.e.help_module

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_faqs.*

class FaqsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_faqs)

        btn_cr.setOnClickListener {
            val intent = Intent(this, CrActivity::class.java)
            //   start your next activity
            startActivity(intent)
        }

        btn_er.setOnClickListener {
            val intent = Intent(this, ErActivity::class.java)
            //   start your next activity
            startActivity(intent)
        }
        }
}
