package GOF23.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Title: ReflectBug
 * @Author Rayn
 * @Date 2019/4/28 21:06
 * @Description: 反射漏洞
 */

public class ReflectBug {
  public static void main(String[] args) throws
      ClassNotFoundException,
      NoSuchMethodException,
      IllegalAccessException,
      InvocationTargetException,
      InstantiationException {
    HolderSingleton ins1 = HolderSingleton.getInstance();

    Class<?> clazz = Class.forName("GOF23.Singleton.HolderSingleton");
    Constructor<?> cons = clazz.getDeclaredConstructor();

    cons.setAccessible(true);                 // 忽略访问控制符检查

    HolderSingleton refIns1 = (HolderSingleton) cons.newInstance();
    HolderSingleton refIns2 = (HolderSingleton) cons.newInstance();

    System.out.println(ins1);                 // cn.raynblog.GOF23.Singleton.HolderSingleton@36d64342
    System.out.println(refIns1);              // cn.raynblog.GOF23.Singleton.HolderSingleton@39ba5a14
    System.out.println(refIns2);              // cn.raynblog.GOF23.Singleton.HolderSingleton@511baa65

    System.out.println(ins1 == refIns1);      // false
    System.out.println(refIns1 == refIns2);   // false
  }
}
