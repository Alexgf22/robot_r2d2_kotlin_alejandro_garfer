/**
 *
 * Aquí se realiza igualmente pero utilizando clases.
 */

class Robot(
    var movimientos: MutableList<Int>, override val size: Int
) : List<Int> {

    fun robotCoordenadas() : List<Int> {
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

    var robot1 = Robot(mutableListOf(2,4,-5,8),4)
    var robot2 = Robot(mutableListOf(-10,-5,2,4,-8),5)

    print("Las coordenadas finales del robot son: ${robot2.robotCoordenadas()}")
}