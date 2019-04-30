package GOF23.Builder;

/**
 * @Title: Client
 * @Author Rayn
 * @Date 2019/4/30 16:41
 * @Description: 客户端, 通过指挥者 Director, 隔离了创建对象的过程, 创建对象交给 Builder 去做, 指挥者只负责生产对象
 */

public class HumanClient {
  public static void main(String[] args) {
    HumanDirector yellowDir = new HumanDirector(new HumanBuilderYellow()),
                  brownDir = new HumanDirector(new HumanBuilderBrown());
    Human theYellow = yellowDir.humanDirect(),
        theBrown = brownDir.humanDirect();
    System.out.println(theYellow);      // Human{head='黑头发', body='黄皮肤', hand='洁白的手', foot='大长腿'}
    System.out.println(theBrown);       // Human{head='金头发', body='黑皮肤', hand='短手', foot='短脚'}
  }
}
