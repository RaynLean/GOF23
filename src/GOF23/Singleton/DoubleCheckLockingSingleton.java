package GOF23.Singleton;

/**
 * @Title: DoubleCheckLockingSingleton
 * @Author Rayn
 * @Date 2019/4/28 17:33
 * @Description: 双重检测锁模式, 由于编译器优化和 JVM 底层内部模型原因, 偶尔会出问题, 不建议使用
 */

public class DoubleCheckLockingSingleton {
  // 加入 volatile 关键字, 禁止重排序
  private volatile static DoubleCheckLockingSingleton instance;
  private DoubleCheckLockingSingleton() {}
  public static DoubleCheckLockingSingleton getInstance() {
    if (instance == null) {       // check 1
      synchronized (DoubleCheckLockingSingleton.class) { // 锁对象用的是 clazz 对象
        if (instance == null) {   // check 2
          instance = new DoubleCheckLockingSingleton();  // 禁止了重排序, 所有的写操作都发生在读操作之后了
        }
      }
    }
    return instance;
  }
}
