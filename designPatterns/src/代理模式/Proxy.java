package 代理模式;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
public class Proxy implements GiveGift {
    private PursuitGirl pursuitGirl;

    public Proxy(SchoolGirl girl) {
        pursuitGirl = new PursuitGirl(girl);
    }

    @Override
    public void giveDolls() {
        pursuitGirl.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuitGirl.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuitGirl.giveChocolate();
    }
}
