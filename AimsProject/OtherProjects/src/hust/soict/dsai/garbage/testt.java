package hust.soict.dsai.garbage;

public class testt {
    private static final int NUM_THREADS = 10; 
    private static final int NUM_ITERATIONS = 100000; 

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Testing StringBuffer...");
        runTest(new StringBuffer(""));

        System.out.println("Testing StringBuilder...");
        runTest(new StringBuilder(""));
    }

    public static void runTest(Appendable appendable) throws InterruptedException {
        Thread[] threads = new Thread[NUM_THREADS];
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(() -> {
                try {
                    for (int j = 0; j < NUM_ITERATIONS; j++) {
                        synchronized (appendable) { 
                            appendable.append("a");
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}
