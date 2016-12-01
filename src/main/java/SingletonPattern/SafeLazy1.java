package SingletonPattern;

/**
 * Created by Knight_JXNU on 2016/12/1.
 */
public class SafeLazy1 {
    private static class SingletonHandlder{
        private static SafeLazy1 safeLazy1 = new SafeLazy1();
    }
    public SafeLazy1(){}
    public static SafeLazy1 getInstance(){
        return SingletonHandlder.safeLazy1;
    }
}
