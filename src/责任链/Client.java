package 责任链;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description： 责任链，把所有的handle连成一条链，总有一个处理
 * javax.servlet.Filter
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);

        Request request2 = new Request(RequestType.TYPE1, "request2");
        handler2.handleRequest(request2);
    }
}
