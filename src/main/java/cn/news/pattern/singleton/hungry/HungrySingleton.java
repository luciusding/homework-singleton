package cn.news.pattern.singleton.hungry;

/**
 * Created by xinhua on 2019-4-10.
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
