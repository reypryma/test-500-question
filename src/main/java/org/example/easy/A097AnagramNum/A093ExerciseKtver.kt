package org.example.easy.A097AnagramNum

class A093ExerciseKtver {
    fun anagramMappings(A: IntArray, B: IntArray): IntArray {
        val mapsBWhereAnagramOfA: HashMap<Int, Int> = HashMap()

        // convert array values of B as key
        for (b in B.indices) {
            mapsBWhereAnagramOfA.put(B[b], b)
        }

        // init array with same length of A array
        val result = IntArray(A.size)

        for (b in B.indices) {
            result[b] = mapsBWhereAnagramOfA[A[b]]!!
        }
        return result
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            // Test your function with sample inputs
            val A = intArrayOf(12, 28, 46, 32, 50)
            val B = intArrayOf(50, 12, 32, 46, 28)
            val result = A093Exercise.anagramMappings(A, B)
            for (i in result) {
                print("$i, ")
            }
            // 1 4 3 2 0
        }
    }
}