package cn.news.pattern.singleton.lazy;

/**
 * Created by xinhua on 2019-4-10.
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    private static LazySimpleSingleton lazySimpleSingleton = null;

    public static synchronized LazySimpleSingleton getInstace(){
        if( lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
