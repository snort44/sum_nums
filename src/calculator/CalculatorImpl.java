package calculator;

/**
 * Created by cortneyhansen on 7/15/17.
 */
public class CalculatorImpl implements Calculator {

    int calc = 0;

    public CalculatorImpl(int i) {
        calc = i;

    }

    @Override
    public Calculator plus(int n) {
        calc += n;
        return this;
    }

    @Override
    public Calculator minus(int n) {
        calc -= n;
        return this;
    }

    @Override
    public int equals() {

        return calc;
    }
}
