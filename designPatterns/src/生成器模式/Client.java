package 生成器模式;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description： 封装一个对象的构造过程，并允许按步骤构造。
 */
public class Client {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        java.lang.StringBuilder sb1 = new java.lang.StringBuilder();
        for (int i = 0; i < 15; i++) {
            sb.append((char) ('a' + i));
        }
        System.out.println(sb.toString());
    }
}
