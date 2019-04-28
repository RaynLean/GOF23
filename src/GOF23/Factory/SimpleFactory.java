package GOF23.Factory;

/**
 * @Title: SimpleFactory
 * @Author Rayn
 * @Date 2019/4/29 13:20
 * @Description: 使用简单的工厂模式
 */
interface Car {
  void run();
}

class Benz implements Car {
  public void run() {
    System.out.println("BENZ: 奔驰");
  }
}

class BMW implements Car {
  public void run() {
    System.out.println("BMW: 宝马");
  }
}

enum CaseCar {
  BENZ, BMW
}

// 简单工厂, 用于生产具体的产品, 具体的产品由选择分支结构来决定
// 当需要添加新的产品的时候, 需要添加新的选择分支, 不合符开闭原则
class CarSimpleFactory {
  // 方式一: 可以使用 if, else if 结构来进行生产
  public static Car createCar(String type) {
    Car car = null;
    if ("Benz".toLowerCase().equals(type.toLowerCase())) {
      car = new Benz();
    } else if ("BMW".toLowerCase().equals(type.toLowerCase())) {
      car = new BMW();
    }
    // 日后需要再进行添加功能, 可以继续通过 else if 进行添加
    return car;
  }

  // 方式二: 可以使用枚举类型, 通过 switch case 来进行生产
  public static Car createCar(CaseCar c) {
    Car car = null;
    switch (c) {
      case BENZ:
        car = new Benz();
        break;
      case BMW:
        car = new BMW();
        break;
      // 如果需要再添加功能, 可以继续通过 case XXX 进行添加
      default:
        break;
    }
    return car;
  }
}

public class SimpleFactory {
  public static void main(String[] args) {
    Car benz1 = CarSimpleFactory.createCar("Benz");       // 通过方式一创建
    Car benz2 = CarSimpleFactory.createCar(CaseCar.BENZ); // 通过方式二创建

    System.out.println(benz1 == benz2);   // false, 两者不是同一个对象
    if (benz1 != null && benz2 != null) {
      benz1.run();
      benz2.run();
    }
  }
}