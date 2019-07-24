package 原型模式;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
public class ConcretePrototype extends Prototype {
    private String filed;

    public ConcretePrototype(String filed) {
        this.filed = filed;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(filed);
    }

    @Override
    public String toString() {
        return filed;
    }
}
