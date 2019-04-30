package GOF23.Builder;

/**
 * @Title: HumanDirector
 * @Author Rayn
 * @Date 2019/4/30 16:38
 * @Description: 指挥者 Director, 用于指导生产组装产品
 */

public class HumanDirector {
  private HumanBuilder builder;
  public HumanDirector(HumanBuilder builder) {
    this.builder = builder;
  }
  public Human humanDirect() {
    builder.buildHead();
    builder.buildBody();
    builder.buildHand();
    builder.buildFoot();
    return builder.getResult();
  }
}
