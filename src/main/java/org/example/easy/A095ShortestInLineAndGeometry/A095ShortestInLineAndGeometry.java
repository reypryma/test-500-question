package org.example.easy.A095ShortestInLineAndGeometry;

public class A095ShortestInLineAndGeometry {

    public static int shortestDistance(int[] points) {
        // Your code here
        if (points == null || points.length < 2) {
            throw new IllegalArgumentException("Array is either null or contains fewer than two points");
        }

        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int distance = Math.abs(points[i] - points[j]);
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }
        return minDistance;
    }

    public static void main(String[] args) {
        // Test your function with sample inputs
        shortestDistance(new int[]{3, 8, 4, 5, 2});

        /*
        *
            shortestDistance([3, 8, 4, 5, 2]) -> 1
            shortestDistance([10, 12, 15]) -> 2
            shortestDistance([7, 7]) -> 0
            shortestDistance([15, 18, 12]) -> 3
        *
        * */
    }
}
