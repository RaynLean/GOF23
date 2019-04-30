package GOF23.Builder;

/**
 * @Title: HumanBuilder
 * @Author Rayn
 * @Date 2019/4/30 16:34
 * @Description: 抽象生产器, 定义构建产品的通用方法
 */

public interface HumanBuilder {
  void buildHead();
  void buildBody();
  void buildHand();
  void buildFoot();
  Human getResult();
}
