package org.example.easy.A097AnagramNum

import java.util.*


class A093ExerciseKt {
    fun anagramMappings(A: IntArray, B: IntArray): IntArray {
        val mapBWhereAnagramOfA = HashMap<Int, Int>()
        for (i in B.indices) {
            mapBWhereAnagramOfA.put(B[i], i)
        }

        val result = IntArray(A.size)
        for (i in A.indices) {
            result[i] = mapBWhereAnagramOfA[A[i]]!!
        }

        return result
    }

    companion object{
        @JvmStatic
        fun main() {
            val A = intArrayOf(12, 28, 46, 32, 50)
            val B = intArrayOf(50, 12, 32, 46, 28)

            // 1 4 3 2 0
        }
    }
}