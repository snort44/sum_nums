package calculator;

/**
 * Get this class running properly by implementing the {@link Calculator} interface.
 * Requirements:
 *  - create a new sublcass that implements the Calclulator interface
 *  -
 */
public class CalculatorAssignment {

    public static void main(String[] args) {

        new CalculatorAssignment().checkAssignment();
    }

    private void checkAssignment() {

        // uncomment the following and get them working!

        assertEquals(2, new CalculatorImpl(1).plus(1).equals());

        assertEquals(9, new CalculatorImpl(5).plus(10).minus(6).equals());

        assertEquals(29, new CalculatorImpl(0).plus(10).plus(10).plus(10).minus(1).equals());

        assertEquals(10, new CalculatorImpl(20).plus(10).plus(10).plus(10).minus(40).equals());

    }

    private void assertEquals(int expected, int actual) {
//        system.out.println ('here is a program');
        System.out.println("expected: " + expected + "    actual: " + actual);
        if (expected != actual) {
            throw new RuntimeException("keep trying!  " + expected + " != " + actual);
        }
    }


}