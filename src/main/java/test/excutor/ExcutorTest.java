package test.excutor;

import java.util.concurrent.*;

public class ExcutorTest {
    public static final int CORE_POOL_SIZE = 2;
    public static final int MAXIMUM_POOL_SIZE = 5;
    public static final int QUEUE_CAPACITY = 10;
    public static final int SLEEP_TIME = 10000;


    public static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE,
            MAXIMUM_POOL_SIZE,
            5,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<Runnable>(QUEUE_CAPACITY),
            new DefaultThreadFactory("default"),
            new ThreadPoolExecutor.AbortPolicy()
    );
    public static void main(String[] args) {
        System.out.println("===开始时====");
        System.out.println("getTaskCount:" + threadPoolExecutor.getTaskCount());
        System.out.println("getCompletedTaskCount:" + threadPoolExecutor.getCompletedTaskCount());
        System.out.println("getCorePoolSize:" + threadPoolExecutor.getCorePoolSize());
        System.out.println("getPoolSize:" + threadPoolExecutor.getPoolSize());
        System.out.println("getMaximumPoolSize:" + threadPoolExecutor.getMaximumPoolSize());
        System.out.println("getLargestPoolSize:" + threadPoolExecutor.getLargestPoolSize());
        System.out.println("getActiveCount:" + threadPoolExecutor.getActiveCount());
        System.out.println("getQueue.size:" + threadPoolExecutor.getQueue().size());

        System.out.println("======提交" + CORE_POOL_SIZE + "任务======");
        for (int i = 0; i < CORE_POOL_SIZE; i++) {
            threadPoolExecutor.submit(() ->{
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        System.out.println("getTaskCount:" + threadPoolExecutor.getTaskCount());
        System.out.println("getCompletedTaskCount:" + threadPoolExecutor.getCompletedTaskCount());
        System.out.println("getCorePoolSize:" + threadPoolExecutor.getCorePoolSize());
        System.out.println("getPoolSize:" + threadPoolExecutor.getPoolSize());
        System.out.println("getMaximumPoolSize:" + threadPoolExecutor.getMaximumPoolSize());
        System.out.println("getLargestPoolSize:" + threadPoolExecutor.getLargestPoolSize());
        System.out.println("getActiveCount:" + threadPoolExecutor.getActiveCount());
        System.out.println("getQueue.size:" + threadPoolExecutor.getQueue().size());

        System.out.println("======再提交" + QUEUE_CAPACITY + "任务======");
        for (int i = 0; i < QUEUE_CAPACITY; i++) {
            threadPoolExecutor.submit(() ->{
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        System.out.println("getTaskCount:" + threadPoolExecutor.getTaskCount());
        System.out.println("getCompletedTaskCount:" + threadPoolExecutor.getCompletedTaskCount());
        System.out.println("getCorePoolSize:" + threadPoolExecutor.getCorePoolSize());
        System.out.println("getPoolSize:" + threadPoolExecutor.getPoolSize());
        System.out.println("getMaximumPoolSize:" + threadPoolExecutor.getMaximumPoolSize());
        System.out.println("getLargestPoolSize:" + threadPoolExecutor.getLargestPoolSize());
        System.out.println("getActiveCount:" + threadPoolExecutor.getActiveCount());
        System.out.println("getQueue.size:" + threadPoolExecutor.getQueue().size());

        System.out.println("======再提交" + QUEUE_CAPACITY + "任务======");
        for (int i = 0; i < QUEUE_CAPACITY; i++) {
            threadPoolExecutor.submit(() ->{
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        System.out.println("getTaskCount:" + threadPoolExecutor.getTaskCount());
        System.out.println("getCompletedTaskCount:" + threadPoolExecutor.getCompletedTaskCount());
        System.out.println("getCorePoolSize:" + threadPoolExecutor.getCorePoolSize());
        System.out.println("getPoolSize:" + threadPoolExecutor.getPoolSize());
        System.out.println("getMaximumPoolSize:" + threadPoolExecutor.getMaximumPoolSize());
        System.out.println("getLargestPoolSize:" + threadPoolExecutor.getLargestPoolSize());
        System.out.println("getActiveCount:" + threadPoolExecutor.getActiveCount());
        System.out.println("getQueue.size:" + threadPoolExecutor.getQueue().size());

        System.out.println("======再提交" + QUEUE_CAPACITY + "任务======");
        for (int i = 0; i < QUEUE_CAPACITY; i++) {
            threadPoolExecutor.submit(() ->{
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        System.out.println("getTaskCount:" + threadPoolExecutor.getTaskCount());
        System.out.println("getCompletedTaskCount:" + threadPoolExecutor.getCompletedTaskCount());
        System.out.println("getCorePoolSize:" + threadPoolExecutor.getCorePoolSize());
        System.out.println("getPoolSize:" + threadPoolExecutor.getPoolSize());
        System.out.println("getMaximumPoolSize:" + threadPoolExecutor.getMaximumPoolSize());
        System.out.println("getLargestPoolSize:" + threadPoolExecutor.getLargestPoolSize());
        System.out.println("getActiveCount:" + threadPoolExecutor.getActiveCount());
        System.out.println("getQueue.size:" + threadPoolExecutor.getQueue().size());

    }
}
