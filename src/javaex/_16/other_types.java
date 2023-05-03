package javaex._16;

import com.sun.jdi.LongType;

import java.time.LocalDate;

public class other_types {

        public static void main(String[] args) {
            exercise1();
            exercise3();
        }

        /**
         * 1: Write code and fix the program below, you want to accept the questionableFunds
         * into the account!
         */
        private static void exercise1() {
            System.out.println("Exercise 1: ");
            int myBankBalanceEuro = 500;

            String suspiciousEmailMessage =
                    """
                                Hello Sir/Madam,
                                
                                I'm a prince here in [redacted] and I need help transferring my billions into 
                                Italy, please provide your bank account details and I will pay you generously.
                                
                                Thanks
                    """;

            long questionableFundsEuro = 5_000_000_000l;

            long myNewBankBalanceEuro = myBankBalanceEuro + questionableFundsEuro;
            System.out.println("My bank balance now is = " + myNewBankBalanceEuro);

            //Add the questionable funds to your bank balance and print it out!
        }

        /**
         * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
         *    type to use to store such data. Why is this the most efficient?
         *
         *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         *    double = 16 decimal places
         *    float = 7 decimal places
         *    int = -2,147,483,648 to 2,147,483,647
         *    short = -32,768 to 32,768
         *    byte = -127 to 127
         *
         *    2a: Someone's age -- short
         *    2b: The age of a baby in months -- byte
         *    2c: Money in a hedgefund in euros -- long
         *    2d: Price of a good in euros on amazon.com -- float
         *    2e: The exact weight of an apple measured by scientific equipment -- double
         *    2f: The number of kilometers from any 2 places in the world -- short
         */

        /**
         * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
         * <p>
         * Play around with local date! What can you get it to do?
         * Use at least the following methods on myDate().
         * * getDayOfMonth()
         * * getDayOfWeek()
         * * getDayOfYear()
         * * getMonth()
         * * getMonthValue()
         * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
         * create other days
         */
        public static void exercise3() {
            System.out.println("Exercise 3:");

            LocalDate todaysDate = LocalDate.now();
            System.out.println("Today is: " + todaysDate);

            System.out.println(todaysDate.getDayOfMonth());
            System.out.println(todaysDate.getDayOfYear());


            LocalDate dayInThePast = LocalDate.of(1993, 05, 28);


            if (dayInThePast.isBefore(todaysDate)){
                System.out.println(dayInThePast + " è un giorno di diversi anni fa!");
            }

            System.out.println(dayInThePast.getMonthValue());
            System.out.println(dayInThePast.getDayOfWeek());
            System.out.println("I was born on " + dayInThePast + ". It was " + dayInThePast.getDayOfWeek() + ".");

        }
    }


