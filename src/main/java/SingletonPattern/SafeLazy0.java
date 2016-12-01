package SingletonPattern;

/**
 * Created by Knight_JXNU on 2016/12/1.
 * 使用 synchronized 修饰达到线程安全的懒汉式单例
 */
public class SafeLazy0 {
    private static SafeLazy0 safeLazy = null;
    private SafeLazy0(){}

    public synchronized SafeLazy0 getInstance(){
        if(safeLazy==null){
            safeLazy = new SafeLazy0();
        }
        return safeLazy;
    }
}
