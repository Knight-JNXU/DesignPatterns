package SingletonPattern;

/**
 * Created by Knight_JXNU on 2016/12/1.
 * 饿汉式单例模式
 */
public class Hungry {
    private static final Hungry hungry = new Hungry();  //不能去掉static，否则报错
    private Hungry(){}
    public static Hungry getInstance(){
        return hungry;
    }
}
