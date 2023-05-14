package javaadv._9;

public class Car implements Movable{
    @Override
    public String moveForward() {
        return "A tutto gas sul rettilineo!";
    }

    @Override
    public String moveBackward() {
        return "Strada sbagliata, devo fare inversione";
    }
}
