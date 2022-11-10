package xyz.devleen.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Ventana2 : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_2= findViewById<Button>(R.id.btn_1V2)


        btn_2.setOnClickListener{
            try {
                var nombre:String = et_nombres.text.toString()
                var Edad= et_edad.text.toString()
                var edad:Int=Integer.parseInt(Edad) // convertidor de entero a edad

                val saltar :Intent=Intent(this, procesar :: class.java)
                //envio de variables

                var nombre:String=et_nombres.text.toString()
                saltar.putExtra("nombre",nombre)
                saltar.putExtra("edad",edad)
                startActivity(saltar)
            } catch (e: NumberFormatException){
                var nombres= "sin edad"
                var edad= 0
                Toast.makeText(applicationContext, "Llene el formulario por completar",
                    Toast.LENGTH_SHORT).show()

            }
        }
    }
}