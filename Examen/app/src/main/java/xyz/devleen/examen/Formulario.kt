package xyz.devleen.examen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.support.v7.app.AppCompatActivity
import android.widget.Toast


class Formulario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.formulario)
        val btn_1=findViewById<Button>(R.id.btnIMC)
        btn_1.setOnClickListener{
            try {
                var Peso:String=txtpeso.text.toString()
                var peso:Double.Companion(Peso)

                var Altura:String=txtaltura.text.toString()
                var altura:Double.Companion(Altura)

                var Occipucio:String=txtoccipucio.text.toString()
                var occipucio:Double.Companion(Occipucio)

                var genero:String=txtgenero.text.toString()

                var nombre:String=txtnombre.text.toString()

                var raza:String=txtraza.text.toString()

                var Calculo:String=txtcalculo.text.toString()
                var calculo:Double.Companion(Calculo)





            }catch (e: NumberFormatException){

                var peso = "Sin dato"
                var altura = "Sin dato"
                var occipucio = "Sin dato"
                var genero = "Sin dato"
                var nombre = "Sin dato"
                var raza = "Sin dato"
                var calculo = "Sin dato"

                Toast.makeText(applicationContext, "LLene el formulario por completo",
                    Toast.LENGTH_SHORT).show()



            }

        }





    }



}