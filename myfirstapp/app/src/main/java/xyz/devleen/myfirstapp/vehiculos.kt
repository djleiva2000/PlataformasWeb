package xyz.devleen.myfirstapp

class vehiculos (var marca: String,
                 val Traccion: Array<Traccion>,
                 val Motor: Array<Motor>,
                 val Tipo: Array<Tipo>,
                 var capacidad: String,
                 var color: String ) {
    enum class Traccion{
        automatica, manual

    }
    enum class Motor{
        V1,
        V2,
        V3
    }

    enum class Tipo {
        SUV,
        sedan,
        camioneta
    }

    fun vehiculo(){

        println("Marca: "+ marca)
        println("Capacidad: "+ capacidad)
        println("Color: "+ color)
        for (i in traccion){
            println("Traccion: " + i)


        }
        for (j in motor){
            println("Motor: " + j)


        }
        for (k in tipo){
            println("Tipo: "+ k)


        }

    }


}