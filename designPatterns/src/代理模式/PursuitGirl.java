package 代理模式;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
public class PursuitGirl implements GiveGift {
    private SchoolGirl girl;

    public PursuitGirl(SchoolGirl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println("送洋娃娃"+girl);
    }

    @Override
    public void giveFlowers() {
        System.out.println("送花");
    }

    @Override
    public void giveChocolate() {
        System.out.println("送巧克力");
    }
}
