package com.example.kotlindemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = findViewById<EditText>(R.id.et_Username)
        var password = findViewById<EditText>(R.id.et_Password)
        var login = findViewById<Button>(R.id.btnLogin)

        login.setOnClickListener {

            val name = username.text.toString()
            val pass = password.text.toString()

            if (name.equals("admin", ignoreCase = true) && pass.equals("admin", ignoreCase = true)){
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("Username",name)
                startActivity(intent)
                Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show()
                finish()
            }
            else if(name.isEmpty()){
                username.setError("Field can't be empty")

            }
            else if (pass.isEmpty()){
                password.setError("Field can't be empty")

            }
            else if(!name.equals("admin")){
                username.setError("Incorrect username")
            }
            else if(!pass.equals("admin")){
                password.setError("Incorrect password")
            }

        }
    }


}
