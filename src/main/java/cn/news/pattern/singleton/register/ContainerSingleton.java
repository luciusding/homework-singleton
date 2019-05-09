package cn.news.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** Spring中就是使用容器注册式单例，非线程安全的
 * Created by xinhua on 2019-4-10.
 */
public class ContainerSingleton {
    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getInstance(String className){
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                }catch(Exception e){
                    e.printStackTrace();
                }
                return obj;
            }else{
                return ioc.get(className);
            }
        }
    }
}
