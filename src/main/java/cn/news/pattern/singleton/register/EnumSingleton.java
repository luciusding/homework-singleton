package cn.news.pattern.singleton.register;

/**
 * Created by xinhua on 2019-4-10.
 */
public enum EnumSingleton {
    INSTAANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTAANCE;
    }
}
