package org.example.easy.A095ShortestInLineAndGeometry

import kotlin.math.abs

object A095ShortestInLineKT {


    private fun shortestDistance(points: IntArray?): Int {
        // Your code here
        require(!(points == null || points.size < 2)) { "Array is either null or contains fewer than two points" }

        var minDistance = Int.MAX_VALUE
        for (i in points.indices){
            for(j in i+1 until points.size){
                if(minDistance > abs(points[i] - points[j])){
                    minDistance = abs(points[i] - points[j])
                }
            }
        }
        return minDistance
    }

    @JvmStatic
    fun main(args: Array<String>) {
        // Test your function with sample inputs
        println(shortestDistance(intArrayOf(3, 8, 4, 5, 2)))
        println(shortestDistance(intArrayOf(10, 12, 15)))
        println(shortestDistance(intArrayOf(7, 7)))
        shortestDistance(intArrayOf(15, 18, 12))
    }
}