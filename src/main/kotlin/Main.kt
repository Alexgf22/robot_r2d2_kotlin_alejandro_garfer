fun robot(movimientos: MutableList<Int>) : Array<Int> {
    var primeraCoordenada = 0
    var segundaCoordenada = 0
    var robotCoordenadasFinal = arrayOf(primeraCoordenada,segundaCoordenada)
    //var eje = "y"

    for (movimiento in movimientos) {
        if (movimiento == movimientos[0]) {
            segundaCoordenada += movimiento
        }
        else {
            if (movimientos.indexOf(movimiento) % 2 == 0) {
                var movimientoAñadir = -movimiento
                segundaCoordenada += movimientoAñadir
            }
            else {
                var movimientoAñadir = -movimiento
                primeraCoordenada += movimientoAñadir
            }

        }
    }
    return robotCoordenadasFinal


}


fun main() {
    var secuenciaMovimientos: MutableList<Int> = mutableListOf()
    var numeros: List<String> = listOf("0","1","2","3","4","5","6","7","8","9")
    var movimientoDado = ""
    //while (movimientoDado != "salir") {
    print("Introduce un movimiento: ")
    movimientoDado = readLine().toString()

    var movimientoEntero = movimientoDado.toInt()

    if (movimientoEntero != null) {
        secuenciaMovimientos.add(movimientoEntero)
    }



    print(robot(secuenciaMovimientos))
}