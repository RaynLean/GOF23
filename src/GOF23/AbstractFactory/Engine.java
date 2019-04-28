package GOF23.AbstractFactory;

/**
 * @Title: Engine
 * @Author Rayn
 * @Date 2019/4/29 19:39
 * @Description: 抽象产品, 定义了引擎的规范, 描述了产品的主要特征和功能, 抽象工厂模式有多个抽象产品
 *               具体产品, 实现了抽象产品所定义的接口, 由具体工厂来创建, 它与具体工厂之间是多对一的关系
 */

public interface Engine {
  void run();
  void start();
}

class LuxuryEngine implements Engine {
  @Override
  public void run() {
    System.out.println("高档引擎, 跑得快");
  }
  @Override
  public void start() {
    System.out.println("高档引擎, 启动得快");
  }
}

class LowEngine implements Engine {
  @Override
  public void run() {
    System.out.println("低端引擎, 跑得慢");
  }
  @Override
  public void start() {
    System.out.println("低端引擎, 启动得慢");
  }
}