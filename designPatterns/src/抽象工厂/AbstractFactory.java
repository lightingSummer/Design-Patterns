package 抽象工厂;

import 工厂.Product;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
abstract public class AbstractFactory {
    abstract public ProductA createProductA();

    abstract public ProductB createProductB();
}
