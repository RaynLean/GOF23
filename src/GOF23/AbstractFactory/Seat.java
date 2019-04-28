package GOF23.AbstractFactory;

/**
 * @Title: Seat
 * @Author Rayn
 * @Date 2019/4/29 19:33
 * @Description: 抽象产品, 定义了座椅的规范, 描述了产品的主要特征和功能, 抽象工厂模式有多个抽象产品
 *               具体产品, 实现了抽象产品所定义的接口, 由具体工厂来创建, 它与具体工厂之间是多对一的关系
 */

public interface Seat {
  void message();
}

class LuxurySeat implements Seat {
  @Override
  public void message() {
    System.out.println("高端座椅, 可以升降高低, 电动调节");
  }
}

class LowSeat implements Seat {
  @Override
  public void message() {
    System.out.println("低端座椅, 不能调节, 不舒服");
  }
}
