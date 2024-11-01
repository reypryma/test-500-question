package org.example.easy.A090MovingAVGFromDStream;

import java.util.LinkedList;
import java.util.Queue;

public class A090Exercise {
    private Queue<Integer> queue;
    private double sum;
    private final int size;

    public A090Exercise(int size) {
        this.queue = new LinkedList<>();
        this.sum = 0.0;
        this.size = size;
    }

    public double next(int val) {
        if (queue.size() == size) {
            sum -= queue.poll();
        }
        queue.offer(val);
        sum += val;
        return sum / queue.size();
    }

    public static void main(String[] args) {
        A090Exercise m = new A090Exercise(3);
        System.out.println(m.next(1));
        System.out.println(m.next(10));
        System.out.println(m.next(3));
        System.out.println(m.next(5));
    }
}
