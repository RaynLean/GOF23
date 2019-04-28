package GOF23.Factory;

/**
 * @Title: NoFactory
 * @Author Rayn
 * @Date 2019/4/29 13:18
 * @Description: 没有使用工厂模式, 创建对象需要通过 new 关键字来进行创建
 */

public class NoFactory {
  public static void main(String[] args) {
    Car benz = new Benz();
    Car bmw = new BMW();

    benz.run();
    bmw.run();
  }
}
