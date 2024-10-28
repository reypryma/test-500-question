package org.example.easy.A083ReadNChar;

public class A083 {
    private int bufferPointer = 0;  // Pointer for buf4
    private int bufferCount = 0;    // Count of characters available in buf4
    private char[] buf4 = new char[4];

    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        // Your code here
        int pointer = 0;  // Pointer for buf

        while (pointer < n) {
            if (bufferPointer == 0) {  // Read more from the source
                bufferCount = new Reader4().read4(buf4);
            }
            if (bufferCount == 0) break;  // End of file reached

            while (pointer < n && bufferPointer < bufferCount) {
                buf[pointer++] = buf4[bufferPointer++];
            }

            if (bufferPointer >= bufferCount) bufferPointer = 0;  // Reset bufferPointer
        }

        return pointer;
    }
}

class Reader4 {
    int read4(char[] buf4) {
        // Mock implementation, actual implementation would read from a file/source
        return 0;
    }
}