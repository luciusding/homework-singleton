package cn.news.pattern.singleton.lazy;

/**
 * Created by xinhua on 2019-4-10.
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
      /*  if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }*/
    }

    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{

        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
