package 抽象工厂;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description： 提供一个接口，用于创建 相关的对象家族 。
 * 抽象工厂对比工厂模式，
 * 抽象工厂模式创建的是对象家族，也就是很多对象而不是一个对象，并且这些对象是相关的
 * 也就是说必须一起创建出来。而工厂方法模式只是用于创建一个对象，这和抽象工厂模式有很大不同。
 * 方法都是让子类来实现，这两个方法单独来看就是在创建一个对象，这符合工厂方法模式的定义。
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactoryImpl1();
        ProductA productA = abstractFactory.createProductA();
        ProductB productB = abstractFactory.createProductB();
    }
}
