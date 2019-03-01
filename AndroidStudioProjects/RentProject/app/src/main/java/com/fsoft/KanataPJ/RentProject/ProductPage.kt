package com.fsoft.KanataPJ.RentProject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_product_page.*

class ProductPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_page)

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)

        }



    }
}
