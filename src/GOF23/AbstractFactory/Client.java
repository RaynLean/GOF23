package GOF23.AbstractFactory;

/**
 * @Title: Client
 * @Author Rayn
 * @Date 2019/4/29 19:41
 * @Description: 测试生产一辆高档汽车
 */

public class Client {
  public static void main(String[] args) {
    CarFactory luxuryCar = new LuxuryCarFactory();
    Engine engine = luxuryCar.createEngine();
    engine.run();       // 高档引擎, 跑得快
    engine.start();     // 高档引擎, 启动得快

    Seat seat = luxuryCar.createSeat();
    seat.message();     // 高端座椅, 可以升降高低, 电动调节

    Tyre tyre = luxuryCar.createTyre();
    tyre.info();        // 高档轮胎, 合金轮毂
  }
}
