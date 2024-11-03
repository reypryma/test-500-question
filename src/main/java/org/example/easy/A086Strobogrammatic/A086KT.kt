package org.example.easy.A086Strobogrammatic


object A086KT {
    fun isStrobogrammatic(num: String): Boolean {
        var left = 0
        var right = num.length - 1
        while (left <= right) {
            if (!isPair(num[left], num[right])) {
                return false
            }
            left++
            right--
        }
        return true
    }

    private fun isPair(a: Char, b: Char): Boolean {
        return a == '0' && b == '0' || a == '1' && b == '1' || a == '8' && b == '8' || a == '6' && b == '9' || a == '9' && b == '6'
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(isStrobogrammatic("69")) // -> true
        println(isStrobogrammatic("818"))
        println(isStrobogrammatic("962"))
    }
}
