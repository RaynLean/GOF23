package GOF23.Builder;

/**
 * @Title: HumanBuilderBrown
 * @Author Rayn
 * @Date 2019/4/30 16:44
 * @Description: 抽象生产者的一个实例, 负责生成复杂对象, 完成复杂产品的各个部件的创建
 */

public class HumanBuilderBrown implements HumanBuilder{
  private Human human;
  public HumanBuilderBrown() {
    this.human = new Human();
  }
  @Override
  public void buildHead() {
    human.setHead("金头发");
  }
  @Override
  public void buildBody() {
    human.setBody("黑皮肤");
  }
  @Override
  public void buildHand() {
    human.setHand("短手");
  }
  @Override
  public void buildFoot() {
    human.setFoot("短脚");
  }
  @Override
  public Human getResult() {
    return human;
  }
}
