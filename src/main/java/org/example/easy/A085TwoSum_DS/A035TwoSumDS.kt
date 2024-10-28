import java.util.HashMap


object A035TwoSumDSKt {
    @JvmStatic
    fun main(args: Array<String>) {
        val twoSum = TwoSumKt()
        twoSum.add(1)
        twoSum.add(3)
        twoSum.add(5)
        twoSum.find(4) // true
        twoSum.find(7) // false
        println(twoSum.find(4))
        println(twoSum.find(7))
    }
}


internal class TwoSumKt {
    private val numbers: MutableMap<Int, Int>

    init {
        // Initialization code here
        numbers = HashMap()
    }

    fun add(number: Int) {
        // Your code here
        numbers[number] = numbers.getOrDefault(number, 0) + 1
    }

    fun find(value: Int): Boolean {
        for (num in numbers.keys) {
            val complement = value - num
            if (complement == num) {
                if (numbers[num]!! > 1) {
                    return true
                }
            } else if (numbers.containsKey(complement)) {
                return true
            }
        }
        return false
    }
}