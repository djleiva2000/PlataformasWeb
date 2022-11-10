package xyz.devleen.myfirstapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class procesar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val extras = intent.extras
        var nombre = extras?.getString("nombre")?:"sin nombre"
        val edad = extras?.getInt("edad")?:-1
         if (edad < 18){
             var mensajeEdad = "Ud es menor de edad"

         }else{
             var mensajeNombre = "Ud es mayor de edad"
         }
        tv_nombre.setText(nombre)
        tv_edad.setText(edad)


        btn_home.setOnClicklistener{
            val saltar: Intent = Intent(this, procesar:: class.java)
            startActivity(saltar)


        }
    }
}