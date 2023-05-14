package javaadv._9;

abstract class Shape {
    private double height, width;

    public Shape(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWeight(double weight) {
        this.width = weight;
    }

    abstract double calculateArea();


}
