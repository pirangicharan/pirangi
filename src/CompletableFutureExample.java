import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {

        // Print the final result when both tasks complete
        CompletableFuture.supplyAsync(() -> {
                    // Simulate a long-running task
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return "Hello";
                })
                .thenApplyAsync(result -> {
                    // Simulate another long-running task that depends on the first task's result
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return result + " World";
                })
                .thenAcceptAsync(System.out::println);

        // Other work can be done while the above tasks are running asynchronously
        System.out.println("Other work can be done while the above tasks are running asynchronously");

        // Wait for the CompletableFuture to complete before exiting
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

