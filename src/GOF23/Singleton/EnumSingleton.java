package GOF23.Singleton;

/**
 * @Title: EnumSingleton
 * @Author Rayn
 * @Date 2019/4/28 20:09
 * @Description: 枚举单例模式
 */

public enum EnumSingleton {
  // 定义一个枚举的元素, 本身就是单例对象
  INSTANCE;
  public void method() {  // 功能处理, 添加自己所需要的操作
    // TODO
  }

  public static void main(String[] args) {
    EnumSingleton e1 = EnumSingleton.INSTANCE;
    EnumSingleton e2 = EnumSingleton.INSTANCE;
    System.out.println(e1 == e2);     // true
  }
}
