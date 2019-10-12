package gr.nikolis.novibetgame.threads;

import android.os.Process;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Singleton class for default executor supplier
 */
public class DefaultExecutorSupplier {

    // Number of cores to decide the number of threads
    private static final int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();

    // Thread pool executor for background tasks
    private final ThreadPoolExecutor mForBackgroundTasks;

    // Thread pool executor for light weight background tasks
    private final ThreadPoolExecutor mForLightWeightBackgroundTasks;

    // Thread pool executor for main thread tasks
    private final Executor mMainThreadExecutor;

    // An instance of DefaultExecutorSupplier
    private static DefaultExecutorSupplier sInstance;

    /**
     * @return The instance of DefaultExecutorSupplier
     */
    public static DefaultExecutorSupplier getInstance() {
        if (sInstance == null) {
            synchronized (DefaultExecutorSupplier.class) {
                sInstance = new DefaultExecutorSupplier();
            }
        }
        return sInstance;
    }

    /**
     * constructor for  DefaultExecutorSupplier
     */
    private DefaultExecutorSupplier() {
        // setting the thread factory
        ThreadFactory backgroundPriorityThreadFactory = new
                PriorityThreadFactory(Process.THREAD_PRIORITY_URGENT_DISPLAY);

        // setting the thread pool executor for mForBackgroundTasks;
        mForBackgroundTasks = new ThreadPoolExecutor(
                NUMBER_OF_CORES * 2,
                NUMBER_OF_CORES * 2,
                60L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                backgroundPriorityThreadFactory
        );

        // setting the thread pool executor for mForLightWeightBackgroundTasks;
        mForLightWeightBackgroundTasks = new ThreadPoolExecutor(
                NUMBER_OF_CORES,
                NUMBER_OF_CORES,
                60L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                backgroundPriorityThreadFactory
        );

        // setting the thread pool executor for mMainThreadExecutor;
        mMainThreadExecutor = new MainThreadExecutor();
    }

    /**
     * @return The thread pool executor for background task
     */
    public ThreadPoolExecutor forBackgroundTasks() {
        return mForBackgroundTasks;
    }

    /**
     * @return The thread pool executor for light weight background task
     */
    public ThreadPoolExecutor forLightWeightBackgroundTasks() {
        return mForLightWeightBackgroundTasks;
    }

    /**
     * @return The thread pool executor for main thread task
     */
    public Executor forMainThreadTasks() {
        return mMainThreadExecutor;
    }
}
