package GOF23.Builder;

/**
 * @Title: HumanBuilderYellow
 * @Author Rayn
 * @Date 2019/4/30 16:36
 * @Description: 抽象生产者的一个实例, 实现了 Builder 接口, 负责生成复杂对象, 完成复杂产品的各个部件的创建
 */

public class HumanBuilderYellow implements HumanBuilder {
  private Human human;
  public HumanBuilderYellow() {
    this.human = new Human();
  }
  @Override
  public void buildHead() {
    human.setHead("黑头发");
  }
  @Override
  public void buildBody() {
    human.setBody("黄皮肤");
  }
  @Override
  public void buildHand() {
    human.setHand("洁白的手");
  }
  @Override
  public void buildFoot() {
    human.setFoot("大长腿");
  }
  @Override
  public Human getResult() {
    return human;
  }
}
