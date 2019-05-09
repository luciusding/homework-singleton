package cn.news.pattern.singleton.lazy;

/**
 * Created by xinhua on 2019-4-10.
 */
public class LazyDoubleCheckSingleton {
    private LazyDoubleCheckSingleton(){}

    private volatile  static  LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private static LazyDoubleCheckSingleton getInstace(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
