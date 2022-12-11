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
    while (movimientoDado != "salir") {
        print("Introduce un movimiento: ")
        movimientoDado = readLine().toString()
        if (movimientoDado != "salir") {
            val movimientoEntero = movimientoDado.toInt()
            secuenciaMovimientos.add(movimientoEntero)
        }
    }



    print("Las coordenadas finales del robot son: ${robot(secuenciaMovimientos)}")
}