package xyz.devleen.examen

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import xyz.devleen.examen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)
        val btn_1=findViewById<Button>(R.id.btn1)
        btn_1.setOnClickListener{
            val saltar: Intent =Intent(this, Formulario::class.java)
            startActivity(saltar)

        }





    }
}