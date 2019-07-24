package 工厂;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description： 定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类。
 * 工厂模式区别于简单工厂模式，是把生产产品放到子类里面
 * 简单工厂是一个工厂，什么东西都能生产
 */
public class Client {
    public static void main(String[] args) {
        FactoryImpl1 factoryImpl1 = new FactoryImpl1();
        Product product1 = factoryImpl1.createProduct();

        FactoryImpl2 factoryImpl2 = new FactoryImpl2();
        Product product2 = factoryImpl2.createProduct();
    }
}
