package GOF23.AbstractFactory;

/**
 * @Title: Tyre
 * @Author Rayn
 * @Date 2019/4/29 19:35
 * @Description: 抽象产品, 定义了轮胎的规范, 描述了产品的主要特征和功能, 抽象工厂模式有多个抽象产品
 *               具体产品, 实现了抽象产品所定义的接口, 由具体工厂来创建, 它与具体工厂之间是多对一的关系
 */

public interface Tyre {
  void info();
}

class LuxuryTyre implements Tyre {
  @Override
  public void info() {
    System.out.println("高档轮胎, 合金轮毂");
  }
}

class LowTyre implements Tyre {
  @Override
  public void info() {
    System.out.println("低端轮胎, 塑料轮毂");
  }
}