package javaoop._exercises._4;

import java.util.Random;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Create variables with the MINIMUM POSSIBLE scope for currentCount and totalCount (both ints)
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        int totalCount = 0;
        for (int i = 0; i < 100; i++) {
            int luckyRolls = 0;
            while (rollD6() == 6) {
                luckyRolls++;
            }
            totalCount += luckyRolls;
        }

        System.out.println(totalCount);
    }


    private static Random random = new Random();

    private static int rollD6() {
        return random.nextInt(6) + 1;
    }

    /**
     * 2a: Change the scope modifiers (also known as access modifiers) in the class ExerciseLunch so no errors appear below,
     * <p>
     * 2b: Now change these modifiers to the MINIMUM possible scope, to have no errors
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");
        ExerciseLunch exerciseLunch = new ExerciseLunch(3.4, "Tuesday");
        exerciseLunch.setLunchWeightInGrams(500);
        System.out.println("Lunch on " + exerciseLunch.getNameOfDayEaten() + " cost " + exerciseLunch.getPrice());
    }

    /**
     * 3: Edit this method and Exercise Lunch to fix the errors in the method below
     *
     *    Only make edits that remove or add the words, static or final
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        // final ExerciseLunch exerciseLunch = null;
        ExerciseLunch exerciseLunch = new ExerciseLunch(3.4, "Tuesday");
        ExerciseLunch.printMaxPrice();
    }

    /**
     * 4: Add constants to the function below for relevant values,
     *    make sure they are static and final
     *    and can be accessed anywhere in this class, but nowhere else.
     *    use SNAKE_CASE naming
     */
    public static void exercise4() {
        System.out.println("\nExercise 4:");
 // non capisco cosa chiede effettivamente la consegna. I valori rilevanti penso siano week, day ed hour ma dovendo essere iterati
 // che senso avrebbe dargli un valore final? Comunque, per soddisfare le richieste avrei utilizzato questa sintassi per aggiungere le costanti:
 // private static final int PER_ESEMPIO

        for (int week = 0; week < 52; week++) {
            for (int day = 0; day < 7; day++) {
                for (int hour = 0; hour < 24; hour++) {
                    System.out.println("Week " + week +", day " + day +", hour " + hour);
                }
            }
        }
    }
}