package com.prep;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExectuorExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable runnableTask = () -> {
            try {
                System.out.println("Enter into test Runnable");
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        executorService.execute(runnableTask);


        Callable<String> callableTask = () -> {
            TimeUnit.MILLISECONDS.sleep(300);
            return "Task's execution";
        };

        List<Callable<String>> callableTasks = new ArrayList<>();
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);
        callableTasks.add(callableTask);

//        Future<String> future =
//                executorService.submit(callableTask);
//
//        System.out.println(future.get());

        List<Future<String>> futures = executorService.invokeAll(callableTasks);

        futures.forEach(fut ->{
            try {
                System.out.println(fut.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

        try {
            if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                executorService.shutdown();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            executorService.shutdown();
        }
    }
}
