package test.atomic;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicValatileTest {

//    private static boolean b = true;//不退出
//    private static volatile boolean b = true;//退出
//    private static AtomicBoolean b = new AtomicBoolean(true);//推出
    private static volatile AtomicBoolean b = new AtomicBoolean(true);//推出

    public static void main(String[] args) throws InterruptedException {
        System.out.println("b init value:" + b.get());
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) { }
//            b =false;
            b.compareAndSet(true, false);
        }).start();
//        while (b) {
        while (b.get()){
            TimeUnit.MILLISECONDS.sleep(0);
            System.out.println("while done");
        }
        System.out.println("done");
    }
}
