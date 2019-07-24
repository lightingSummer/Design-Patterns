package 抽象工厂;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
public class AbstractFactoryImpl2 extends AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}