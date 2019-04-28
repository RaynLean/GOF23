package GOF23.AbstractFactory;

/**
 * @Title: CarFactory
 * @Author Rayn
 * @Date 2019/4/29 19:37
 * @Description: 抽象工厂 Abstract Factory, 提供创建产品的接口, 包含多个创建产品的方法
 */

public interface CarFactory {
  Engine createEngine();
  Seat createSeat();
  Tyre createTyre();
}