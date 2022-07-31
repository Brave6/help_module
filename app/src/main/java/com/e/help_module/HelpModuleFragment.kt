package com.e.help_module

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.help_module.*

class HelpModuleFragment : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.help_module)

        btn_gl.setOnClickListener {
            val intent = Intent(this, GlActivity::class.java)
            //   start your next activity
            startActivity(intent)
        }

            btn_faqs.setOnClickListener {
                val intent = Intent(this, FaqsActivity::class.java)
                //   start your next activity
                startActivity(intent)
            }

                btn_ci.setOnClickListener {
                    val intent = Intent(this, InfoActivity::class.java)
                    //   start your next activity
                    startActivity(intent)
                }


   //     val glActButton = findViewById<Button>(R.id.btn_gl)
     //   glActButton.setOnClickListener {
      //   val intent = Intent(this, GlActivity::class.java)
       //    startActivity(intent)

      //     val faqsActButton = findViewById<Button>(R.id.btn_faqs)
    //        faqsActButton.setOnClickListener {
        //       val intent = Intent(this, FaqsActivity::class.java)
       //         startActivity(intent)

         //       val infoActButton = findViewById<Button>(R.id.btn_ci)
          //      infoActButton.setOnClickListener{
          //        val intent = Intent(this,InfoActivity::class.java)
              //    startActivity(intent)
          }




}



