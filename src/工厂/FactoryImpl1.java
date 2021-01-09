package 工厂;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/23 0023
 * @description：
 */
public class FactoryImpl1 extends Factory {
    @Override
    public Product createProduct() {
        return new ProductImpl1();
    }
}
