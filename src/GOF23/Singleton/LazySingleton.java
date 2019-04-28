package GOF23.Singleton;

/**
 * @Title: LazySingleton
 * @Author Rayn
 * @Date 2019/4/28 16:47
 * @Description: 懒汉式单例模式: 线程安全, 调用效率不高, 但是可以延时加载
 */

public class LazySingleton {
  // 1. 私有静态成员变量, 不进行初始化, 在需要调用的时候才进行初始化操作
  private static LazySingleton instance;
  // 2. 私有构造器, 使得其他类不能直接通过 new 来创建对象
  private LazySingleton() {
    if (instance != null) {
      throw new RuntimeException();
    }
  }
  // 3. 提供公开的静态同步方法, 因为懒汉式是在调用的时候创建实例的, 需要对实例是否创建进行判断
  // 在多线程环境下, 如果不加同步, 则可能出现创建多个实例的现象, 也因为加了同步, 所以调用效率不高
  public static synchronized LazySingleton getInstance() {
    if (instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }
}
