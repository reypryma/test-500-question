import java.util.*

class Exercise(private val size: Int) {
    private val queue: Queue<Int> = LinkedList()
    private var sum = 0.0

    fun next(`val`: Int): Double {
        if (queue.size == size) {
            sum -= queue.poll().toDouble()
        }
        queue.offer(`val`)
        sum += `val`.toDouble()
        return sum / queue.size
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val m = Exercise(3)
            println(m.next(1))
            println(m.next(10))
            println(m.next(3))
            println(m.next(5))
        }
    }
}