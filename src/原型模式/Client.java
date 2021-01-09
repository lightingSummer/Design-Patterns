package 原型模式;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("asd");
        Prototype prototypeClone = prototype.clone();
        System.out.println(prototypeClone.toString());
    }
}
