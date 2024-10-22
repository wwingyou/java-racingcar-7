package racingcar;

/**
 * StaticRandomGenerator
 */
public class StaticRandomGenerator implements RandomGenerator {

    private int staticNumber;

    public StaticRandomGenerator() {}

    public StaticRandomGenerator(int staticNumber) {
        this.staticNumber = staticNumber;
    }

    @Override
    public int getRandomNumber() {
        return staticNumber;
    }

    public void setStaticNumber(int staticNumber) {
        this.staticNumber = staticNumber;
    }

    public int getStaticNumber() {
        return staticNumber;
    }

}
