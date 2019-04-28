package GOF23.Factory;

/**
 * @Title: FactoryMethod
 * @Author Rayn
 * @Date 2019/4/29 16:00
 * @Description: 工厂方法模式
 */

interface OperationFactory {
  Operation createOperation();
}

class AddOperationFactory implements OperationFactory {
  @Override
  public Operation createOperation() {
    return new Add();
  }
}
class SubOperationFactory implements OperationFactory {
  @Override
  public Operation createOperation() {
    return new Sub();
  }
}
class MulOperationFactory implements OperationFactory {
  @Override
  public Operation createOperation() {
    return new Mul();
  }
}
class DivOperationFactory implements OperationFactory {
  @Override
  public Operation createOperation() {
    return new Div();
  }
}

interface Operation {
  double getResult(double num1, double num2);
}

class Add implements Operation{
  public double getResult(double num1, double num2) {
    return num1 + num2;
  }
}
class Sub implements Operation{
  public double getResult(double num1, double num2) {
    return num1 - num2;
  }
}
class Mul implements Operation{
  public double getResult(double num1, double num2) {
    return num1 * num2;
  }
}
class Div implements Operation{
  public double getResult(double num1, double num2) {
    return num1 / num2;
  }
}

public class FactoryMethod {
  public static void main(String[] args) {
    Operation add = new AddOperationFactory().createOperation();
    Operation sub = new SubOperationFactory().createOperation();
    Operation mul = new MulOperationFactory().createOperation();
    Operation div = new DivOperationFactory().createOperation();

    System.out.println(add.getResult(3, 6));
    System.out.println(sub.getResult(3, 6));
    System.out.println(mul.getResult(3, 6));
    System.out.println(div.getResult(3, 6));
  }
}