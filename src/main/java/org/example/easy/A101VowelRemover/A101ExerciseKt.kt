package org.example.easy.A101VowelRemover

class A101ExerciseKt {
    fun removeVowels(s: String): String {
        // Your code here
        val sb = StringBuffer()
        for (c in s.toCharArray()) {
            if (!"AEIOUaeiou".contains(c.toString())) {
                sb.append(c)
            }
        }
        return sb.toString()
    }

    fun removeVowelsToArray(s: String): String {
        // Your code here
        val sb = StringBuffer()
        for (c in s.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) == -1) {
                sb.append(c)
            }
        }
        return sb.toString()
    }
}