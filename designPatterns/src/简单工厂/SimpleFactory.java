package 简单工厂;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/23 0023
 * @description：
 */
public class SimpleFactory {
    public static Product createProduct(int type) {
        if (type == 1) {
            return new ProductImpl1();
        } else {
            return new ProductImpl2();
        }
    }
}
