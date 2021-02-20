package com.javase.threadTest.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newCachedThreadPool创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，
 * 若无可回收，则新建线程。线程池的规模不存在限制。
 */
public class NewCachedThreadPool {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            /**
             * execute和submit都属于线程池的方法，execute只能提交Runnable类型的任务，
             * 而submit既能提交Runnable类型任务也能提交Callable类型任务。
             *
             * execute会直接抛出任务执行时的异常，submit会吃掉异常，可通过Future的get方法将任务执行时的异常重新抛出。
             *
             * execute所属顶层接口是Executor,submit所属顶层接口是ExecutorService，
             * 实现类ThreadPoolExecutor重写了execute方法,抽象类AbstractExecutorService重写了submit方法。
             */

            //1- 在未来某个时间执行给定的命令。
            // 该命令可能在新的线程、已入池的线程或者正调用的线程中执行，这由 Executor 实现决定。
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("execute");
                    System.out.println(index);
                    System.out.println("execute");
                }
            });

            //2- 提交一个 Runnable 任务用于执行，并返回一个表示该任务的 Future。
            // 该 Future 的 get 方法在成功完成时将会返回给定的结果
            cachedThreadPool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("submit");
                    System.out.println(index);
                    System.out.println("submit");
                }
            });
        }
        cachedThreadPool.shutdown();
    }

}
