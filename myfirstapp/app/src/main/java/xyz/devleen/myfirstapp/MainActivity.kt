package xyz.devleen.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variableConstante()
        //tipoDatos()
        //array()
        //maps()
        iva12()
        validacionCedula()
        edad()
        tablaMult()
        listProyectos()
        vehiculo()


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

         var id = arrayOf (1,1,5,0,2,4,1,8,2,4)






     }


//
// Validar si una persona es mayor o menor de edad
//

    fun edad (){
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
        val carro = vehiculos (marca = "Toyota",
            arrayOf(vehiculos.Traccion.automatica, vehiculos.Traccion.manual),
            arrayOf(vehiculos.Motor.V1, vehiculos.Motor.V2 ),
            arrayOf(vehiculos.Tipo.camioneta, vehiculos.Tipo.sedan),
            capacidad = "4 personas", color = "rojo")
        println(carro.marca)
        carro.vehiculo()



    }



}