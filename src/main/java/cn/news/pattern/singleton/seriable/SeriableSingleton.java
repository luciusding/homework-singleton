package cn.news.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * Created by xinhua on 2019-4-10.
 */
public class SeriableSingleton implements Serializable{

    private SeriableSingleton(){}

    public static final SeriableSingleton seriableSingleton = new SeriableSingleton();

    public static SeriableSingleton getInstance(){
        return seriableSingleton;
    }

    public Object readResolve(){
        return seriableSingleton;
    }
}
