package cn.news.pattern.singleton.threadlocal;

import cn.news.pattern.singleton.lazy.LazySimpleSingleton;

/**
 * Created by xinhua on 2019-4-10.
 */
public class ExecutorThread implements Runnable{
    @Override
    public void run() {
        ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + threadLocalSingleton);
    }
}
