package com.example.firstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var editText: EditText? = null
    private var btnOkay: Button? = null
    private var txtView: TextView? = null
    private var numTimesClick = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById<EditText>(R.id.editText)
        btnOkay = findViewById<Button>(R.id.btnOkay)
        txtView = findViewById<TextView>(R.id.txtView)


        btnOkay?.setOnClickListener (object : View.OnClickListener{
            override fun onClick(v: View?) {
                numTimesClick += 1
                txtView?.append("\n The button got $numTimesClick times Clicked")
            }

        })

    }

}
