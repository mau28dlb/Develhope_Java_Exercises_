package javaadv._6;

public class enums {

        public static void main(String[] args) {
            exercise1();
            exercise2();
            exercise3();
            exercise4();
            exercise5();
        }

        private enum YouCanUseClassLocalEnumsLikeThis {
            THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
            THIS_TOO
        }

        /**
         * 1:
         *
         *
         * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
         *
         * Loop over the values with Days.values() and print them out.
         */
        private static void exercise1() {
            System.out.println("\nExercise 1: ");
            // Your code here
            enum Days {
                MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
            }

            for (Days day: Days.values()) {
                System.out.println(day);
            }
        }

        /**
         * 2:
         *
         *
         * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
         *
         * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
         *
         */
        private static void exercise2() {
            System.out.println("\nExercise 2: ");
            // Your code here
            System.out.println("Fall season is: " + monthsRange(Seasons.FALL));
        }

           public enum Seasons {
                SPRING("From March 21 to June 21"),
                SUMMER("From June 22 to 22 September"),
                FALL("From September 23 to December 21"),
                WINTER("From December 22 to March 20");

                String months;

                Seasons(String months) {
                    this.months = months;
                }

                public String getMonths() {
                    return months;
                }
            }

            public static String monthsRange (Seasons monthsRange){
            return monthsRange.getMonths();
            }









        /**
         * 3:
         *
         *
         * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
         *
         * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
         *
         */
        private static void exercise3() {
            System.out.println("\nExercise 3: ");
            // Your code here
            System.out.println();
        }
// Non sono riuscito ad arrivare ad un metodo funzionante
            enum TrafficLight {
                RED, YELLOW, GREEN;}

    /*TrafficLight startingLight = TrafficLight.GREEN;

    public TrafficLight iterate(TrafficLight startingLight) {
        switch (this.startingLight) {
            case RED:
                System.out.println("RED, you have to stop and wait...");
                 this.startingLight = startingLight.GREEN;
            break;

            case GREEN:
                System.out.println("GREEN, you can go!");
                 this.startingLight = startingLight.YELLOW;
            break;

            case YELLOW:
                System.out.println("YELLOW, ");
                 this.startingLight = startingLight.RED;
            break;
        }
        return iterate(TrafficLight.RED);
    }*/






                /**
                 * 4:
                 * <p>
                 * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
                 * <p>
                 * Write an if statement that prints weekend or weekday based on the enum
                 */
                private static void exercise4() {
                    System.out.println("\nExercise 4: ");
                    // Your code here
                    enum Days {
                        MONDAY(false),
                        TUESDAY(false),
                        WEDNESDAY(false),
                        THURSDAY(false),
                        FRIDAY(false),
                        SATURDAY(true),
                        SUNDAY(true);

                        private boolean isWeekend;

                        Days(boolean isWeekend) {
                            this.isWeekend = isWeekend;
                        }


                    }
                    Days days = Days.SUNDAY;
                    days = Days.MONDAY;

                    if (days.isWeekend == true) {
                        System.out.println("Weekend!");
                    } else {
                        System.out.println("Weekday!");
                    }

                }

                /**
                 * 5:
                 * <p>
                 * <p>
                 * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
                 * <p>
                 * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
                 */
                private static void exercise5() {
                    System.out.println("\nExercise 5: ");
                    // Your code here
                    double num1 = 5;
                    double num2 = 2;
                    System.out.println(calcolatrice(num1, num2, Operator.ADD));
                }

                enum Operator {
                    ADD,
                    SUBTRACT,
                    MULTIPLY,
                    DIVIDE;
                }

                public static double calcolatrice(double num1, double num2, Operator operator) {

                    if (operator == Operator.ADD) {
                        return num1 + num2;
                    } else if (operator == Operator.SUBTRACT) {
                        return num1 - num2;
                    } else if (operator == Operator.MULTIPLY) {
                        return num1 * num2;
                    } else {
                        return num1 / num2;
                    }

                }
            }







