package javaadv._9;

public class Guitar extends Instrument{
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public String play() {
        return "Jon Gomm's guitar sound";
    }
}
