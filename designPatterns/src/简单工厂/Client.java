package 简单工厂;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/23 0023
 * @description：
 */
public class Client {
    public static void main(String[] args) {
        int type = 1;
        Product product = SimpleFactory.createProduct(type);
    }
}
