package javaex._3;



public class Variables_naming_comments {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();

    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int myAge = 29;
        System.out.println("My age is " + myAge);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        char myInitial = 'M';
        int myAge = 29;
        System.out.println("My age = " + myAge +", my initial = " + myInitial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // say that lunch hasn't been eaten and store it in a variable
        boolean hasEatenLunch = false;
        // storing the lunch cost in another variable
        double lunchCost = 5.99;
        // print the variables in two different lines
        System.out.println("Lunch cost=" + lunchCost);
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
