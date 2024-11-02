package org.example.easy.A091LoggerRateLimiter;

import java.util.HashMap;
import java.util.Map;

public class A091Exercise {
    static class Logger {
        // Your code here
        private final Map<String, Integer> messageMap;

        /** Initialize your data structure here. */
        public Logger() {
            messageMap = new HashMap<>();
        }

        /**
         * Returns true if the message should be printed in the given timestamp,
         * otherwise returns false.
         * If this method returns false, the message will not be printed.
         * The timestamp is in seconds granularity.
         *         If it does not, or if the difference between the current timestamp and
         *         the last logged timestamp for the message is 10 or more,
         */
        public boolean shouldPrintMessage(int timestamp, String message) {
            if(messageMap.containsKey(message) && timestamp - messageMap.get(message) >= 10){
                return true;
            } else if(!messageMap.containsKey(message)){
                messageMap.put(message, timestamp);
                return true;
            };
            return false;
/*            if (!messageMap.containsKey(message) || timestamp - messageMap.get(message) >= 10) {
                messageMap.put(message, timestamp);
                return true;
            }
            return false;*/
        }

    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        Logger logger = new Logger();
        System.out.println(logger.shouldPrintMessage(1, "foo")); // Returns true
        System.out.println(logger.shouldPrintMessage(2, "bar")); // Returns true
        System.out.println(logger.shouldPrintMessage(3, "foo")); // Returns false
    }

}
