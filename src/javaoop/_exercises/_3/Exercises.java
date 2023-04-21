package javaoop._exercises._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        Student noOne = new Student("Michael", "Scott", 25, 101, 123144);


        noOne.setName("Ascanio");
        noOne.setSurname("Troll");
        noOne.setRoom(114);
        noOne.setAge(17);
        noOne.setIdNumber(639776);
        System.out.println(noOne.getIdNumber() +" "+ noOne.getName() +" "+ noOne.getSurname() +" "+ noOne.getAge() +" "+ noOne.getRoom());


        // Write and use your 5 getters and setters!
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here

        Student noTwo = new Student("Aaaaaaaaaaaaaaaaaa", "Bbbbbbbbbbbbbb", 25, 2000, 777888);

        int newAge = 28;


        noTwo.setAge(40);
        noTwo.setAge(33);
        noTwo.setAge(newAge);
        System.out.println(noTwo.getAge());
        System.out.println(noTwo.getHowManyAgeValues());
    }

}
