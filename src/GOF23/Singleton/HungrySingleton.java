package GOF23.Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @Title: HungrySingleton
 * @Author Rayn
 * @Date 2019/4/28 16:47
 * @Description: 饿汉式单例模式: 线程安全, 调用效率高, 但是不能延时加载
 */

public class HungrySingleton implements Serializable {
  // 1. 私有静态成员并赋值, 随着类一起进行初始化操作, 所以不能进行延时加载
  private static final HungrySingleton instance = new HungrySingleton();
  // 2. 私有构造器, 使得其他的类不能通过 new 来创建对象
  private HungrySingleton() {
    if (instance != null) {
      throw new RuntimeException();
    }
  }
  // 3. 提供公开访问的方法 --- 不需要同步, 因为类加载时已经初始化完毕, 也不需要判断是否为 null
  public static HungrySingleton getInstance() {
    return instance;
  }

  // 反序列化时, 如果定义了 readResolve() 方法, 则直接返回此方法指定的对象, 而不需要创建新对象
  private Object readResolve() throws ObjectStreamException {
    return instance;
  }
}
