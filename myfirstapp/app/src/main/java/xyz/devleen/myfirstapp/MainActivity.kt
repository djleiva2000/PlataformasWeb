package xyz.devleen.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2V2.setOnClickListener{

            val saltar:=Intent(this, ventana2::class.java)
            startActivity(saltar)

        }









        btniV2.setOnClickListener{
            val saltar:Intent= Intent(this, Ventana2::class.java)
            startActivity(saltar)
        }

        //variableConstante()
        //tipoDatos()
        //array()
        //maps()
        //iva12()
        //validacionCedula()
        //edad()
        //tablaMult()
        //listProyectos()
        //vehiculo()


    }

    fun variableConstante(){

        //creacion de variables
        /*
        seccion de comentarios multi linea
        */
        var saludo = "Hola mundo :)";
        saludo = "Bienvenido Diego :)"
        println(saludo)

        val contante1= "parelo 1"
        val contante2= contante1
        println(contante2)
    }
    fun tipoDatos(){
        val string1= "desarrollo mov"
        val string2= "Bienvenidos"
        val string3= string2 + "a la materia de  "+ string1
        println(string3)


        val pais ="EEUU"
        when (pais){
            "Peru", "Ecuador","Colombia"->{
                println("hablan español")

            }
            "EEUU"->{
                println("hablan ingles")

            }
            "Brasil"->{
                println("hablan portugues")
            }else -> println("no hay lenguajes")

        }
    }


    fun array(){
        val name = "Diego"
        val apellido= "leiva"
        val university = "UTPL"
        val age = "22"
        val myArray= arrayListOf<String>()
        myArray.add(name)
        myArray.add(apellido)
        myArray.add(university)
        myArray.add(age)
        println(myArray)
        myArray.addAll(listOf("Hola", "Curso de android"))
        println(myArray)


        //elimina datos de array
        myArray.removeAt(4)
        println(myArray)

        //recorrer el array
        myArray.forEach{
            println(it)
        }



    }

    fun maps(){
        var myMap: Map<String, Int> = mapOf()
        myMap= mutableMapOf("ramiro" to 1,"Pedro" to 2, "sara" to 5)


    }
//
//
// _____________________________________________Trabajo en clase ______________________________________________________
//
//
//   Calcular el IVA
    fun iva12(){
        var num1: Int =100
        var iva: Float = 0.12.toFloat()
        var Iva_pagar = num1 * iva
        var precioTotal = num1 + Iva_pagar
        println("Precio del producto " + num1)
        println("iva a pagar "+ Iva_pagar)
        println("Precio total "+ precioTotal)
    }

//
//  Validacion Cedula de identidad
//
     private fun validacionCedula(){
    println("----------------------------------------------------------")

         var id = arrayOf (1,1,5,0,2,4,1,8,2,4)
         var coe = arrayOf(2,1,2,1,2,1,2,1,2,1)
         var total = 0
         var total2 = 0
         var tot = 0
         var tot2 = 0
         var tot3 = 0
         var total3 = 0
         var dec1 = 0
         var dec2 = 0
         var dec3 = 0
         var dec4 = 0
         var dec5 = 0
         var dec6 = 0
         var comp = 0
         val comp2 = 0
         val res = IntArray(10)


         for (i in 0 until id.size ) {
             total = coe[i] * id.get(i)
             res [i] = total
             println("resultado es: $total")
         }

         for (i in 0..9) {
             res[i] = total
             res[i] = coe[i] * id.get(i) + id.get(9) * 0
             total2 += res[i]
             total3 = total2 - id.get(9)
         }

         for (i in 0..9) {
             if (res[i] >= 10) {
                 tot2 = tot2 + 1
                 tot3 = tot2 * 9
                 tot = total3 - tot3
             }
         }
         println("el total es: $tot")

         dec1 = tot / 10
         dec2 = dec1 + 1
         dec3 = dec2 * 10
         comp = dec3 - tot
         println("la resta es: $comp")

         if (comp === id.get(9) || id.get(9) === 0) {
             println("su numero de ceudla es correcta")
         } else {
             println("Su numero de cedula no es correcto  favor escribalo de nuevo")
         }

         if (total >= 10) {
             println(+total3)
             dec4 = total3 / 10
             dec5 = dec4 + 1
             dec6 = dec5 * 10
             comp = dec6 - total3
             if (comp === id.get(9)) {
                 println("su numero de ceudla es correcta")
             } else {
                 println("Su numero de cedula no es correcto  favor escribalo de nuevo")
             }
         }


     }


//
// Validar si una persona es mayor o menor de edad
//

    fun edad (){
        print("----------------------------------------------------------")

        var edadPersona = 22
        if (edadPersona >= 18){
            println("Su edad es: " + edadPersona + ", Es mayor de edad")


        }else if (edadPersona < 18){
            println("Su edad es: " + edadPersona + ", Es menor de edad")

        }

    }
//
// Presentar la tabla de multiplicar de n numero de forma ascendente y descendente.
//

    fun tablaMult (){
        print("----------------------------------------------------------")

        var num = 5
        for (i in 1..9){
            println(num*i)
        }
        println("-----------------------------")

        for (i in 9 downTo 0){
            println(num*i)
        }
    }
//
// Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos por proyectos (Mostrar los resultados ordenados).
//
    fun listProyectos(){
    print("----------------------------------------------------------")


    var myMap: Map<String,String> = mapOf()

    myMap= mutableMapOf("Diego" to "Funerraria de perros",
        "Mateo" to "Funerraria de perros",
        "erick" to "Funerraria de perros",
        "Pablo" to "Gestor de clima",
        "Alejandro" to "Gestor de clima",
        "Carlos" to "Gestor de clima",
        "Antonio" to "gestor de clima",
        "Steven" to "Funerraria de perros",
        "Miguel" to "Funerraria de perros"


        )
    println("Lista de paralelo")
    for (i in myMap.toSortedMap()){
            println(i.key )

    }
    print("-------- Funeraria de perros --------")

    for (i in myMap.toSortedMap()){
        if (i.value == "Funerraria de perros"){
            println(i.key )
        }
    }

    print("-------- Gestor de clima --------")
    for (i in myMap.toSortedMap()){
        if (i.value == "gestor de clima"){
            println(i.key )
        }
    }



    }
//
//    Presentar las propiedades de un vehículo utilizando clases, como tracción, motor, tipo de vehículo, capacidad
//
    private fun vehiculo(){
    println("----------------------------------------------------------")

    val carro = vehiculos (marca = "Toyota",
            arrayOf(vehiculos.Traccion.automatica, vehiculos.Traccion.manual),
            arrayOf(vehiculos.Motor.V1, vehiculos.Motor.V2 ),
            arrayOf(vehiculos.Tipo.camioneta, vehiculos.Tipo.sedan),
            capacidad = "4 personas", color = "rojo")
        println(carro.marca)
        carro.vehiculo()



    }



}