class Rectangulo(b: Int = 1, h: Int = 1) {
    var base = b
    var altura = h

    fun calcularArea(): Int = base * altura
    fun calcularPerimetro(): Int = (base + altura) * 2

    override fun toString():String{return "Base = $base, altura = $altura"}
}

fun main(args: Array<String>) {
    val r1 = Rectangulo(3, 4)
    val r2 = Rectangulo(1, 5)
    val r3 = Rectangulo(8, 10)
    println("Área de R1 = " + (r1.calcularArea()))
    println("Perímetro de R1 = " + r1.calcularPerimetro())

    println("Área de R2 = " + (r2.calcularArea()))
    println("Perímetro de R2 = " + r2.calcularPerimetro())

    println("Área de R3 = " + (r3.calcularArea()))
    println("Perímetro de R3 = " + r3.calcularPerimetro())
}