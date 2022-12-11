/**
 * La función de robot lo que hace es inicializar dos variables, la primera la x y la segunda la y.
 * Después recorre cada uno de los pasos que da el robot de la lista y si ocupa posición par en la lista
 * se añade a la segunda coordenada que es la 'y' con el signo cambiado y en caso contrario se añade
 * a la primera coordenada con el signo cambiado. Pero si ocupa la primera posición se queda con el
 * mismo signo y se añade a la segunda coordenada que es la 'y'.
 *
 * @param movimientos: MutableList<Int> = Secuencia de pasos que da el robot.
 *
 * @return lista con la primera coordenada de la 'x' y la segunda coordenada de la 'y'
 */
fun robot(movimientos: MutableList<Int>) : List<Int> {

    var primeraCoordenada = 0
    var segundaCoordenada = 0

    for (movimiento in movimientos) {
        if (movimiento == movimientos[0]) {
            segundaCoordenada += movimiento
        }
        else {
            if (movimientos.indexOf(movimiento) % 2 == 0) {
                val movimientoAñadir = -movimiento
                segundaCoordenada += movimientoAñadir
            }
            else {
                val movimientoAñadir = -movimiento
                primeraCoordenada += movimientoAñadir
            }

        }
    }
    return listOf(primeraCoordenada,segundaCoordenada)


}


fun main() {
    val secuenciaMovimientos: MutableList<Int> = mutableListOf()
    var movimientoDado = ""
    var caracteresNoValidos = listOf<String>("!","#","$","%","&","/","(",")","=","?","¡","'","[","]","{","}",".",";","|","º","@","ª","_","´¨","·","~","€","*","`","^")
    while (movimientoDado != "salir") {
        print("Introduce un movimiento: ")
        movimientoDado = readLine().toString()
        movimientoDado = movimientoDado.replace(" ","")
        fun error() {
            if (movimientoDado != "salir") {
                println("No se permiten caracteres que no sean numeros ni espacios")
            }
        }
        if (movimientoDado in ("a".."z") || movimientoDado in ("A".."Z") || movimientoDado in caracteresNoValidos) {
            error()
        } else {
            val movimientoEntero = movimientoDado.toInt()
            secuenciaMovimientos.add(movimientoEntero)
        }
    }



    print("Las coordenadas finales del robot son: ${robot(secuenciaMovimientos)}")
}


