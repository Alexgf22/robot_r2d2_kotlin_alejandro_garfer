/**
 * La función de robot lo que hace es inicializar dos variables, la primera la x y la segunda la y.
 * Después inicializa un contador para controlar que a partir del segundo movimiento hay una secuencia
 * donde 'x' e 'y' de la posición 1 y 2 de la lista cambian de signo, después 'x' e 'y' de la posición 3 y 4
 * no cambian de signo y así sucesivamente. Eso se controla con el contador que cuando llega al cuarto movimiento
 * sin contar la primera 'y' se reinicia el contador a 0 y vuelve a empezar como se ha mencionado anteriormente.
 *
 * @param movimientos: MutableList<Int>  Secuencia de pasos que da el robot.
 *
 * @return lista con la primera coordenada final de la 'x' y la segunda coordenada final de la 'y'.
 */
fun robot(movimientos: MutableList<Int>) : List<Int> {

    var primeraCoordenada = 0
    var segundaCoordenada = 0
    var contador = 0

    for (movimiento in movimientos) {
        if (movimiento == movimientos[0]) {
            segundaCoordenada += movimiento
        }
        else {
            contador += 1
            when (contador) {
                1 -> {
                    val movimientoAñadir = -movimiento
                    primeraCoordenada += movimientoAñadir
                }
                2 -> {
                    val movimientoAñadir = -movimiento
                    segundaCoordenada += movimientoAñadir
                }
                3 -> {
                    val movimientoAñadir = movimiento
                    primeraCoordenada += movimientoAñadir
                }
                4 -> {
                    val movimientoAñadir = movimiento
                    segundaCoordenada += movimientoAñadir
                    contador = 0
                }
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


