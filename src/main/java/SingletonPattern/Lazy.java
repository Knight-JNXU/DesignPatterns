package SingletonPattern;

/**
 * Created by Knight_JXNU on 2016/12/1.
 * 懒汉式单例
 */
public class Lazy {
    private Lazy lazy = null;
    private Lazy(){}
    public Lazy getInstance(){
        if(lazy==null){
            lazy = new Lazy();
        }
        return lazy;
    }
}
