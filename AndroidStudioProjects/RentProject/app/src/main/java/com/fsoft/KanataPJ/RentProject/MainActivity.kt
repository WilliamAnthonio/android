package com.fsoft.KanataPJ.RentProject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {



        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)



        btnLogin.setOnClickListener {

            var Name = txtName.text.toString();
            var Password = txtPassword.text.toString();

            if(Name.length == 0 || Password.length == 0){
                Toast.makeText(applicationContext,"Name or Password can not be empty !",Toast.LENGTH_SHORT).show()
            }
            else{
                if (Name.equals("Hello") && Password.equals("123456789")){
                    Toast.makeText(applicationContext,"Logged in Sucessfully !",Toast.LENGTH_SHORT).show()


                    val intent = Intent(this, ProductPage :: class.java)
                    startActivity(intent)
                }
                else{
                    Toast.makeText(applicationContext,"Try Again Password not Match!",Toast.LENGTH_SHORT).show()
                }
            }

        }
        btnClear.setOnClickListener {
            txtName.text.clear()
            txtPassword.text.clear()
        }

    }
}
