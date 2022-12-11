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


