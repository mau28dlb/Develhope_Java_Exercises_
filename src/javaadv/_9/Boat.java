package javaadv._9;

public class Boat implements Movable{
    @Override
    public String moveForward() {
        return "A prua!";
    }

    @Override
    public String moveBackward() {
        return "A poppa!";
    }
}
