package GOF23.AbstractFactory;

/**
 * @Title: LowCarFactory
 * @Author Rayn
 * @Date 2019/4/29 19:41
 * @Description: 具体工厂, 低端汽车工厂, 实现抽象工厂中的多个抽象方法, 完成具体产品的创建
 */

public class LowCarFactory implements CarFactory {
  @Override
  public Engine createEngine() {
    return new LowEngine();
  }
  @Override
  public Seat createSeat() {
    return new LowSeat();
  }
  @Override
  public Tyre createTyre() {
    return new LowTyre();
  }
}
