class Cuenta(val numeroCuenta:String, var saldo:Double = 0.0){

    fun recibirAbono(ingreso:Double){ saldo += ingreso }
    fun realizarPago(pago:Double){ saldo -= pago }

    companion object {
        fun esMorosa(p: Persona) :Boolean{

            for (cuenta in p.cuentas)
                cuenta?.let{
                    if (cuenta.saldo < 0.0)
                        return true
                }
            return false
        }
    }
}

class Persona(var dni:String = "", var cuentas:Array<Cuenta?> = arrayOfNulls(3)){
    var cantidadCuentas = 0

    fun anyadirCuenta(cuenta:Cuenta){
        if (cantidadCuentas < 3)
            cuentas[cantidadCuentas++] = cuenta;
        else
            println("La persona con dni $dni ha alcanzado el máximo de cuentas (3)")
    }
}

fun imprimirMorosidad(descubierto:Boolean){
    if(descubierto)
        println("Alguna de sus cuentas tiene saldo negativo.")
    else
        println("Ninguna de sus cuentas tiene saldo negativo.")
}


fun main(){
    var c1 = Cuenta("001", 0.0)
    var c2 = Cuenta("002", 700.0)
    var c3 = Cuenta("003", 850.33)
    var c4 = Cuenta("004", 116.25)

    var persona1 = Persona("001A")
    persona1.anyadirCuenta(c1)
    persona1.anyadirCuenta(c2)

    /*  //Prueba para comprobar que anyadirCuenta no permite más de 3 cuentas.
    persona1.anyadirCuenta(c3)
    persona1.anyadirCuenta(c4)
    */

    c1.recibirAbono(100.0)  //Recibe la nómina
    c2.realizarPago(750.0)   //Paga el alquiler
    imprimirMorosidad(Cuenta.esMorosa(persona1))

    //Se ejecuta el traspaso de 100 euros de una cuenta a otra para evitar estar en números rojos
    c1.realizarPago(100.0)
    c2.recibirAbono(100.0)
    println("Tras el traspaso entre cuentas...")
    imprimirMorosidad(Cuenta.esMorosa(persona1))


}