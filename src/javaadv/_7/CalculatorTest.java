package javaadv._7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    class CalculatorTest {
        /**
         * 1:
         *
         *
         * Create JUnit test for the add() and subtract() methods in the Calculator class.
         *
         * Test the methods with multiple test cases, including positive and negative numbers, and zero.
         *
         * Verify that the methods return the correct result for each test case.
         *
         * If there is an error you may have to change the code in Calculator to fix it!
         */
        @Test
        void exercise1() {
            System.out.println("\nExercise 1: ");
            // Your code here
            // la calcolatrice aveva un errore nel metodo add
            Calculator calculator = new Calculator();
            Assertions.assertEquals(12, calculator.add(6, 6));
            Assertions.assertEquals(4888, calculator.add(2300, 2588));
            Assertions.assertEquals(0, calculator.subtract(500, 500));
            Assertions.assertEquals(1000, calculator.subtract(500,  - 500));
            Assertions.assertEquals(500, calculator.subtract(500,  0));
        }

        /**
         * 2:
         *
         *
         * Create JUnit test for the multiply() and divide() methods in the Calculator class.
         *
         * Test the same kind of inputs as before as exercise 1
         *
         * If there is an error you may have to change the code in Calculator to fix it!
         *
         */
        @Test
        void exercise2() {
            System.out.println("\nExercise 2: ");
            // Your code here
            // c'era un errore nel multiply

            Calculator calculator = new Calculator();
            Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
            Assertions.assertEquals(60, calculator.multiply(5, 12));
            Assertions.assertEquals(0, calculator.multiply(0, 12));
            Assertions.assertEquals(2, calculator.divide(24, 12));

        }

        /**
         * 3:
         *
         * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
         * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
         * Test with decimals too!
         * Verify that the method returns the correct result for each test case.
         *
         * If there is an error you may have to change the code in Calculator to fix it!
         *
         * Don't just write tests that use the result of the program as the expected!!
         */
        @Test
        void exercise3() {
            System.out.println("\nExercise 3: ");
            // Your code here
            // base ed esponente erano invertiti nel metodo power, c'è però un problema che persiste,
            // la calcolatrice non tiene conto dei numeri negativi


            Calculator calculator = new Calculator();
            Assertions.assertEquals(-4.0, calculator.power(-2.0, 2.0));
            Assertions.assertEquals(16, calculator.power(4,2 ));
            Assertions.assertEquals(0, calculator.power(0, 2));
            Assertions.assertEquals(1, calculator.power(2, 0 ));
            Assertions.assertEquals(6, calculator.power(6, 1 ));
            Assertions.assertEquals(-20, calculator.power(10, -2 ));
            Assertions.assertEquals(53164.54091112397, calculator.power(5.2, 6.6 ));
        }
    }

