package 代理模式;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
public class Client {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("唐嫣");
        Proxy proxy = new Proxy(schoolGirl);

        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}
