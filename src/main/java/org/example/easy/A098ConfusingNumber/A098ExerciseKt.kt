package org.example.easy.A098ConfusingNumber

object A098ExerciseKt {
    fun isConfusingNumber(num: Int): Boolean {

        // Your code here
        val map = intArrayOf(0, 1, -1, -1, -1, -1, 9, -1, 8, 6)

        val copyNum = num
        var num = num
        var digit = 1
        var result = 0

        while (num != 0){
            if(map[num % 10] == -1) return false

            result = map[num % 10] % 10 + result * digit
            digit *= 10
            num /= 10
        }
        return copyNum != result
    }

    @JvmStatic
    fun main(args: Array<String>) {
        // Test your function with sample inputs
        println(isConfusingNumber(6))
        println(isConfusingNumber(89))
        println(isConfusingNumber(11))
        println(isConfusingNumber(25))
    }
}
