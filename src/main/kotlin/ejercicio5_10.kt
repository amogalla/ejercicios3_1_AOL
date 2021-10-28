var LIMITE_LIBROS = 10

class Libro(val titulo:String, val autor:String, val numeroPaginas:Int =0, var calificaion:Int =0){}

class ConjuntoLibros(var libros:Array<Libro?> = kotlin.arrayOfNulls(LIMITE_LIBROS)) {
    var librosAnotados: Int = 0

    fun anyadirLibro(libro: Libro) {
        if (librosAnotados < LIMITE_LIBROS) {
            if(!existeLibro(libro))
                libros[librosAnotados++] = libro
            else println("El libro que intentas añadir ya existe en el conjunto.")
        } else println("Le biblioteca está completa. Debe eliminar un libro antes de añadir otro.")
    }

    fun existeLibro(libro: Libro): Boolean {
        for (obra in libros)
            if (obra == libro)
                return true
        return false
    }

    fun mostrarConjunto(){
        println("\n ** Este es el conjunto de libros completo **")
        for (obra in libros)
            obra?.let {
                println("Título: " + obra!!.titulo + ". Autor: " + obra.autor)
            }
    }

    fun posicionPorTitulo(titulo:String): Int{
        var indice = 0
        for (obra in libros) {
            obra?.let {
                if (obra.titulo == titulo)
                    return indice
            }
            indice++
        }
        return -1
    }

    fun eliminarLibroPorTitulo(titulo: String) {
        val indice = posicionPorTitulo(titulo)
        if(indice != -1){
            for (actual in indice..librosAnotados - 2)
                libros[actual] = libros[actual + 1]
            libros[librosAnotados - 1] = null
        }
        else println("El título introducido no existe.")
    }

    fun posicionPorAutor(autor:String): Int{
        var indice = 0
        for (obra in libros) {
            obra?.let {
                if (obra.autor == autor)
                    return indice
            }
            indice++
        }
        return -1
    }

    fun eliminarLibroPorAutor(autor: String) {
        val indice = posicionPorAutor(autor)
        if(indice != -1){
            for (actual in indice..librosAnotados - 2)
                libros[actual] = libros[actual + 1]
            libros[librosAnotados - 1] = null
        }
        else println("No hay ningún libro de ese autor.")
    }
}

fun main(){
    val libro1 = Libro("El signo de los cuatro", "A. Conan Doyle", 150, 9)
    val libro2 = Libro("Contact", "Carl Sagan", 318, 7)
    val biblioteca = ConjuntoLibros()

    biblioteca.anyadirLibro(libro1)
    biblioteca.anyadirLibro(libro2)

    biblioteca.eliminarLibroPorTitulo("Contact")
    biblioteca.mostrarConjunto()

    biblioteca.eliminarLibroPorAutor("A. Conan Doyle")
    biblioteca.mostrarConjunto()
}