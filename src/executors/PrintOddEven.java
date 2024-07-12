package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class PrintOddEven {

    private static final int MAX_NUMBER = 10;
    private static final AtomicBoolean oddTurn = new AtomicBoolean(true);

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable printOdd = () -> {
            for (int i = 1; i <= MAX_NUMBER; i += 2) {
                while (!oddTurn.get()) {
                    Thread.yield();
                }
                System.out.println("Odd: " + i);
                oddTurn.set(false);
            }
        };

        Runnable printEven = () -> {
            for (int i = 2; i <= MAX_NUMBER; i += 2) {
                while (oddTurn.get()) {
                    Thread.yield();
                }
                System.out.println("Even: " + i);
                oddTurn.set(true);
            }
        };

        executor.submit(printOdd);
        executor.submit(printEven);

        executor.shutdown();

    }
}
