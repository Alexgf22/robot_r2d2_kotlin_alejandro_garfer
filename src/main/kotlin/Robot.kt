/**
 * La función de robot lo que hace es inicializar dos variables, la primera la x y la segunda la y.
 * Después inicializa un contador para controlar que a partir del segundo movimiento hay una secuencia
 * donde 'x' e 'y' de la posición 1 y 2 de la lista cambian de signo, después 'x' e 'y' de la posición 3 y 4
 * no cambian de signo y así sucesivamente. Eso se controla con el contador que cuando llega al cuarto movimiento
 * sin contar la primera 'y' se reinicia el contador a 0 y vuelve a empezar como se ha mencionado anteriormente.
 *
 * @constructor
 *
 * @param movimientos: MutableList<Int>  Secuencia de pasos que da el robot.
 * @param size: Int   Tamaño de la lista.
 *
 * @return lista con la primera coordenada final de la 'x' y la segunda coordenada final de la 'y'.
 */

class Robot(
    var movimientos: Array<Int>, override val size: Int
) : List<Int> {

    fun robotCoordenadas() : List<Int> {

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

    override fun contains(element: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<Int>): Boolean {
        TODO("Not yet implemented")
    }

    override fun get(index: Int): Int {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<Int> {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<Int> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<Int> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<Int> {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: Int): Int {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: Int): Int {
        TODO("Not yet implemented")
    }

}



fun main() {

    var robot1 = Robot(arrayOf(-10,-5,2),3)
    var robot2 = Robot(arrayOf(-10,-5,2,4,-8),5)

    println("Las coordenadas finales del robot son: ${robot1.robotCoordenadas()}")
    println("Las coordenadas finales del robot son: ${robot2.robotCoordenadas()}")
}