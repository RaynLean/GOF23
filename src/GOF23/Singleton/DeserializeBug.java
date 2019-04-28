package GOF23.Singleton;

import java.io.*;

/**
 * @Title: DeserializeBug
 * @Author Rayn
 * @Date 2019/4/28 21:43
 * @Description: 反序列化漏洞
 */

public class DeserializeBug {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    HungrySingleton ins1 = HungrySingleton.getInstance();

    // 序列化
    ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream("./src/cn/raynblog/GOF23/Singleton/DeserializeBug.txt"));
    oos.writeObject(ins1);
    oos.close();

    ObjectInputStream ois = new ObjectInputStream(
        new FileInputStream("./src/cn/raynblog/GOF23/Singleton/DeserializeBug.txt"));
    HungrySingleton ins2 = (HungrySingleton) ois.readObject();

    System.out.println(ins1);         // HungrySingleton@366e2eef
    System.out.println(ins2);         // HungrySingleton@12843fce

    System.out.println(ins1 == ins2); // false
  }
}
