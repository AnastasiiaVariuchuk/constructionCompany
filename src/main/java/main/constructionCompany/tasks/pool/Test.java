package main.constructionCompany.tasks.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test  {
    // Maximum number of threads in thread pool
    static final int MAX_T = 3;

    public static void main(String[] args)
    {
        // creates five tasks
        Runnable r1 = new ThreadPool("task 1");
        Runnable r2 = new ThreadPool("task 2");
        Runnable r3 = new ThreadPool("task 3");
        Runnable r4 = new ThreadPool("task 4");
        Runnable r5 = new ThreadPool("task 5");

        // creates a thread pool
        // threads as the fixed pool size
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        // passes the Task objects to the pool to execute
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        // pool shutdown
        pool.shutdown();
    }
}