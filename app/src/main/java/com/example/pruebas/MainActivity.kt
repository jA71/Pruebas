package com.example.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebas.databinding.ActivityMainBinding
import com.example.pruebas.interface_user.Principal
import com.example.pruebas.interface_user.Products

class MainActivity : AppCompatActivity() {

    private lateinit var views: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityMainBinding.inflate(layoutInflater)
        setContentView(views.root)
        initializacionListeners()

    }

    private fun initializacionListeners() {
        views.button.setOnClickListener {
            //var textoRecogido = views.textInput.text
            //Toast.makeText(this, views.textInput.text, Toast.LENGTH_SHORT).show()
            //views.textInput.setText ( resources.getString(R.string.app_name))
            val userText = views.textInput.text.toString()
            val passwordText = views.passwordUser.text.toString()

            userText?.let {
                passwordText?.let { itp ->
                    if (it.equals("fer") && itp.equals("5311")) {
                        goToPrincipal(userText)
                    }
                }
            }
        }

        views.button2.setOnClickListener {
            goToProducts()
        }
    }

    private fun goToPrincipal(userText:String) {
        var intent: Intent = Intent(this,Principal::class.java)
        intent.putExtra("name_user", userText)
        startActivity(intent)

    }

    private fun goToProducts() {
        var intent: Intent = Intent(this, Products::class.java)
        startActivity(intent)
    }

}