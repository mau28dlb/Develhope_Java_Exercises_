package javaadv._9;

public class Circle extends Shape {
    public Circle(double height, double width) {
        super(height, width);

    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }
}
