package com.prep;

import java.util.concurrent.*;

public class ScheduledExecutorServiceExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<String> callable = () ->{

            TimeUnit.SECONDS.sleep(3);
            return "This is new callble";
        };

        ScheduledExecutorService executorService = Executors
                .newSingleThreadScheduledExecutor();


      Future<String> future = executorService.schedule(callable, 1, TimeUnit.SECONDS);

        System.out.println(future.get());

        try {

        if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS)) {
            executorService.shutdown();
        }
        }catch (InterruptedException e) {
            e.printStackTrace();
            executorService.shutdown();
        }

    }
}
