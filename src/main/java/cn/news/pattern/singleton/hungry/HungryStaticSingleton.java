package cn.news.pattern.singleton.hungry;

/**
 * Created by xinhua on 2019-4-10.
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;
    static{
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
