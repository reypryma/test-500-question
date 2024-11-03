package org.example.easy.A091LoggerRateLimiter


object Exercise {
    @JvmStatic
    fun main(args: Array<String>) {
        val logger = Logger()
        println(logger.shouldPrintMessage(1, "foo")) // Returns true
        println(logger.shouldPrintMessage(2, "bar")) // Returns true
        println(logger.shouldPrintMessage(3, "foo")) // Returns false
    }

    internal class Logger {
        private val messageMutableMap = mutableMapOf<String, Int>()

        /**
         * Returns true if the message should be printed in the given timestamp, otherwise returns false.
         * If this method returns false, the message will not be printed.
         * The timestamp is in seconds granularity.
         */
        fun shouldPrintMessage(timestamp: Int, message: String): Boolean {
            if (!messageMutableMap.containsKey(message) || timestamp - messageMutableMap[message]!! >= 10) {
                messageMutableMap[message] = timestamp
                return true
            }
            return false
        }
    }

}