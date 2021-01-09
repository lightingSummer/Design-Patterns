package 生成器模式;

import java.util.Arrays;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/24 0024
 * @description：
 */
public class AbstractStringBuilder {
    protected char[] value;
    protected int count;

    public AbstractStringBuilder(int capacity) {
        count = 0;
        value = new char[capacity];
    }

    public AbstractStringBuilder append(char c) {
        ensureCapacity(count + 1);
        value[count++] = c;
        return this;
    }

    private void ensureCapacity(int minCapNeed) {
        if (minCapNeed > value.length) {
            addCapacity(minCapNeed);
        }
    }

    private void addCapacity(int minCapNeed) {
        int needCap = value.length;
        while (needCap < minCapNeed) {
            needCap *= 2;
        }
        char[] newValue = new char[needCap];
        newValue = Arrays.copyOf(value, count);
        value = newValue;
    }
}
