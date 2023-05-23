package javaadv._8;

public class Exercises {
        public static void main(String[] args) {
            exercise1();
            exercise2();
            exercise3();
        }

        /**
         * 1:
         *
         *
         * Create a class called "Dog" that extends the Animal class.
         *
         * Add a new field called "breed" to the Dog class.
         *
         * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
         *
         * Write getters and setters for the breed field.
         */
        private static void exercise1() {
            System.out.println("\nExercise 1: ");
            // Your code here
        }

        /**
         * 2:
         *
         *
         * Create new classes called "Fish" and "Bird" that extends the Animal class.
         *
         * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
         *
         * Also create constructors, getters and setters
         *
         */
        private static void exercise2() {
            System.out.println("\nExercise 2: ");
            // Your code here
        }


        /**
         * 3:
         *
         * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
         * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
         * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
         *
         * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
         * and print out which of the animals has the fastest movement speed in MetersPerSecond
         */
        private static void exercise3() {
            System.out.println("\nExercise 3: ");
            // Your code
            Dog dog = new Dog(1.1, 20, "Border Collie");
            Fish fish = new Fish(0.3, 0.5, "Catfish");
            Bird bird = new Bird(0.4, 2, 1.30);

           double dogSpeed = dog.runSpeedMetersPerSecond(dog.getHeight());
           double fishSpeed = fish.swimSpeedMetersPerSecond(fish.getWeight());
           double birdSpeed = bird.flySpeedMetersPerSecond(bird.getWingSpan());

           if (dogSpeed > fishSpeed && fishSpeed > birdSpeed){
               System.out.println("Dog is the fastest one with " + dogSpeed + " m/s");
           } else if (fishSpeed > dogSpeed && fishSpeed > birdSpeed){
               System.out.println("Fish is the fastest one with " + fishSpeed + " m/s");
           } else if (birdSpeed > fishSpeed && birdSpeed > dogSpeed){
               System.out.println("Bird is the fastest one with " + birdSpeed + " m/s");
           }
        }
    }


