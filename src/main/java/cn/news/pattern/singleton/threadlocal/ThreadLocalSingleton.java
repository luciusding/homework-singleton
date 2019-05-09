package cn.news.pattern.singleton.threadlocal;

/**
 * Created by xinhua on 2019-4-10.
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}

    private static final  ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
