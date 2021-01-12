// Homework 11.   Oleksandr Myrko
import java.util.concurrent.ForkJoinPool;

public class Solution {
    static long time1;
    static long time2;
    static int n = 50;

    public static void main(String[] args) {
        time1 = System.currentTimeMillis();
        FibonacciLoop fibonacciLoop = new FibonacciLoop(n);
        time2 = System.currentTimeMillis();
        System.out.println("Compute Fibonacci number using loop.");
        System.out.println(String.format("Result for number %d: %d.  Execution time is %dms\n", n, fibonacciLoop.execute(), time2-time1));

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        time1 = System.currentTimeMillis();
        long result = forkJoinPool.invoke(new FibonacciForkJoin(n));
        time2 = System.currentTimeMillis();
        System.out.println("Compute Fibonacci number using ForkJoinPool.");
        System.out.println(String.format("Result for number %d: %d.  Execution time is %dms", n, result, time2 - time1));
    }
}
