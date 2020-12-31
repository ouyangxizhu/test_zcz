package atomic;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongTest {
    public final static AtomicLong atomicLong = new AtomicLong(1L);

    static {
        atomicLong.getAndIncrement();
        System.out.println(atomicLong);
    }

    public static void main(String[] args) {
        new AtomicLongTest();
    }
}
