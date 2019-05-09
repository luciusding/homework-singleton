package cn.news.pattern.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * Created by xinhua on 2019-4-10.
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object o1 = c.newInstance();
            Object o2 = c.newInstance();
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
