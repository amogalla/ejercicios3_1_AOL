class Coche(matricula:String, color:String = "", marca:String = "", modelo:String = "", cavallos:Int = 100, numPuertas:Int = 0) {
    var color = color
    var marca = marca
    var modelo = modelo
    var cavallos = cavallos
    var numPuertas = numPuertas
    var matricula = matricula

    override fun toString():String{
        return "Marca = $marca, modelo = $modelo, color = $color, nº de puertas = $numPuertas, matrícula = $matricula, CV = $cavallos"
    }
}

fun main(args: Array<String>) {
    var c1 = Coche("1917LQ","Rojo", "Ferrari", "Vento", 300, 3 )
    var c2 = Coche("1111AA","Gris", "Renault", "Laguna", 250, 5)
    var c3 = Coche("1234ZZ","Negro", "Peugeot", "P4", 110, 4)
    var c4 = Coche("8765RT")

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