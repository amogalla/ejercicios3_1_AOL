class Coche(var matricula:String, var color:String = "", var marca:String = "", var modelo:String = "", var caballos:Int = 100, var numPuertas:Int = 0) {
    override fun toString():String{
        return "Marca = $marca, modelo = $modelo, color = $color, nº de puertas = $numPuertas, matrícula = $matricula, CV = $caballos"
    }
}

fun main(args: Array<String>) {
    val c1 = Coche("1917LQ","Rojo", "Ferrari", "Vento", 300, 3 )
    val c2 = Coche("1111AA","Gris", "Renault", "Laguna", 250, 5)
    val c3 = Coche("1234ZZ","Negro", "Peugeot", "P4", 110, 4)
    val c4 = Coche("8765RT")

    println("Estos son los coches originales:")
    println(c1)
    println(c2)
    println(c3)
    println(c4)

    c1.color = "Azul"
    c2.color = "Amarillo"
    c3.color = "Blanco"
    c4.color = "Dorado"

    println("\n\nEstos son los coches tras cambiarles el color:")
    println(c1)
    println(c2)
    println(c3)
    println(c4)
}