package org.example.easy.A087IntervalScheduling

import java.util.*

data class Interval(val start: Int, val end: Int)

fun canAttendMeetings(intervals: Array<Interval>?): Boolean {
    // Your code here
    if (intervals.isNullOrEmpty()) {
        return true;
    }

    Arrays.sort(intervals) { a: Interval, b: Interval -> a.start - b.start }

    for (i in 1 until intervals.size) {
        if (intervals[i].start < intervals[i - 1].end) {
            return false
        }
    }
    return true
}

fun main() {
    // Test your function with sample inputs
    println(canAttendMeetings(arrayOf(Interval(7, 10), Interval(2, 4)))) // -> true
    println(canAttendMeetings(arrayOf(Interval(0, 30), Interval(5, 10), Interval(15, 20)))) // -> false
}