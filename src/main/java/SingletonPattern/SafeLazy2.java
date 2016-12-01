package SingletonPattern;

/**
 * Created by Knight_JXNU on 2016/12/1.
 * DCL的双检查机制实现安全的懒汉式单例（重要）
 */
public class SafeLazy2 {
    volatile private static SafeLazy2 instance = null;
    private SafeLazy2(){}
    public static SafeLazy2 getInstance(){
        if(instance==null){
            synchronized (SafeLazy2.class){
                if(instance==null){
                    instance = new SafeLazy2();
                }
            }
        }
        return instance;
    }
}
