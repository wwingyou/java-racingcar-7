package racingcar;

/**
 * StaticRandomGenerator
 */
public class StaticRandomGenerator implements RandomGenerator {

    private int staticNumber;

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
