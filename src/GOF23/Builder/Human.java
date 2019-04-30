package GOF23.Builder;

/**
 * @Title: Human
 * @Author Rayn
 * @Date 2019/4/30 16:33
 * @Description: 产品类 Product, 是一个复杂的对象
 */

public class Human {
  private String head;
  private String body;
  private String hand;
  private String foot;
  public String getHead() {
    return head;
  }
  public void setHead(String head) {
    this.head = head;
  }
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }
  public String getHand() {
    return hand;
  }
  public void setHand(String hand) {
    this.hand = hand;
  }
  public String getFoot() {
    return foot;
  }
  public void setFoot(String foot) {
    this.foot = foot;
  }
  @Override
  public String toString() {
    return "Human{" +
        "head='" + head + '\'' +
        ", body='" + body + '\'' +
        ", hand='" + hand + '\'' +
        ", foot='" + foot + '\'' +
        '}';
  }
}
