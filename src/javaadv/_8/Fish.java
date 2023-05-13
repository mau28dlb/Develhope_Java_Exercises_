package javaadv._8;

public class Fish extends Animal {

    private String species;

    public Fish(double height, double weight, String species) {
        super(height, weight);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public static double swimSpeedMetersPerSecond(double weight){
        double fishWeight;
        return fishWeight = weight * 2;
    }


}
