package cn.news.pattern.singleton.threadlocal;

/**
 * Created by xinhua on 2019-4-10.
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread thread1 = new Thread(new ExecutorThread());
        Thread thread2 = new Thread(new ExecutorThread());
        thread1.start();
        thread2.start();


    }
}
