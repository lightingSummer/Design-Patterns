package 模板方法;

/**
 * @author     ：lightingSummer
 * @date       ：2019/8/20 0020
 * @description：
 */
public class Main {
    public static void main(String[] args) {
        BaseTest baseTest1 = new ReetTest1();
        BaseTest baseTest2 = new ReetTest();

        baseTest1.ask();
        baseTest1.tell();

        baseTest2.ask();
        baseTest2.tell();
    }
}
