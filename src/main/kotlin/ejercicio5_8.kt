class Tiempo(hora:Int, minuto:Int = 0, segundo:Int = 0) {
    var hora = hora
    var minuto = minuto
    var segundo = segundo

    override fun toString():String{ return "%2d".format(hora) + "h " + "%2d".format(minuto) + "m " + "%2d".format(segundo) + "s."}

}

fun main(){
    var horas:Int; var minutos:Int; var segundos:Int

    do {
        print("Introduzca las horas:")
        horas = try{
            (readLine() ?: "0").toInt()
        }catch (ex: NumberFormatException) {-1}  //El catch establece el valor en -1 para forzar a seguir en el bucle
    }while(horas !in 0..23)

    do {
        print("Introduzca los minutos:")
        minutos = try{
            (readLine() ?: "0").toInt()
        }catch (ex: NumberFormatException) {-1} //El catch establece el valor en -1 para forzar a seguir en el bucle
    }while(minutos !in 0..59)

    do {
        print("Introduzca los segundos:")
        segundos = try{
            (readLine() ?: "0").toInt()
        }catch (ex: NumberFormatException) {-1} //El catch establece el valor en -1 para forzar a seguir en el bucle
    }while(segundos !in 0..59)



    var t1 = Tiempo(horas, minutos, segundos)
    var t2 = Tiempo(horas, minutos)
    var t3 = Tiempo(horas)

    println(t1.toString())
    println(t2.toString())
    println(t3.toString())
}