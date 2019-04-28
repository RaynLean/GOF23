package GOF23.AbstractFactory;

/**
 * @Title: LuxuryCarFactory
 * @Author Rayn
 * @Date 2019/4/29 19:38
 * @Description: 具体工厂, 高端汽车工厂, 实现抽象工厂中的多个抽象方法, 完成具体产品的创建
 */

public class LuxuryCarFactory implements CarFactory {
  @Override
  public Engine createEngine() {
    return new LuxuryEngine();
  }
  @Override
  public Seat createSeat() {
    return new LuxurySeat();
  }
  @Override
  public Tyre createTyre() {
    return new LuxuryTyre();
  }
}