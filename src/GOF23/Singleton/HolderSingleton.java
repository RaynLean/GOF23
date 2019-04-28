package GOF23.Singleton;

/**
 * @Title: HolderSingleton
 * @Author Rayn
 * @Date 2019/4/28 18:06
 * @Description: 静态内部类模式, 外部类的 getInstance() 指向内部类 Holder 持有的对象
 */

public class HolderSingleton {
  private static class Holder {
    private static final HolderSingleton instance = new HolderSingleton();
  }
  private HolderSingleton() {
    throw new RuntimeException();
  }
  public static HolderSingleton getInstance() {
    return Holder.instance;
  }
}
