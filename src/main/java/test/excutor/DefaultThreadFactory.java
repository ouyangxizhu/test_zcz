package test.excutor;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author czz
 */
public class DefaultThreadFactory implements ThreadFactory {
    static final AtomicInteger poolNumber = new AtomicInteger(1);
    final AtomicInteger threadNumber;
    final ThreadGroup group;
    final String namePrefix;
    boolean isDaemon = true;

    public Thread newThread(Runnable r) {
        Thread t = new Thread(this.group, r, this.namePrefix + this.threadNumber.getAndIncrement(),
                -3715992351445876736L);

        t.setDaemon(this.isDaemon);
        if (t.getPriority() != 5) {
            t.setPriority(5);
        }

        return t;
    }

    public DefaultThreadFactory(String name) {
        this(name, true);
    }

    public DefaultThreadFactory(String prefix, boolean isDaemon) {
        this.threadNumber = new AtomicInteger(1);
        this.group = new ThreadGroup(prefix + "-" + poolNumber.getAndIncrement() + "-threadGroup");
        this.namePrefix = prefix + "-" + poolNumber.get() + "-thread-";
        this.isDaemon = isDaemon;
    }

    /**
     * @return the group
     */
    public ThreadGroup getGroup() {
        return group;
    }

}
