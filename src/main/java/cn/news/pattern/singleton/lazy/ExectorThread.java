package cn.news.pattern.singleton.lazy;

import cn.news.pattern.singleton.lazy.LazySimpleSingleton;

/**
 * Created by xinhua on 2019-4-10.
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstace();
        System.out.println(Thread.currentThread().getName() + ":" + lazySimpleSingleton);
    }
}
