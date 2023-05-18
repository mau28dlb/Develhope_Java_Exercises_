package javaadv._11;

public record Person(String name, int age, String address) {

    @Override
    public String toString(){
        return "Name: " + this.name + ", Age: " + this.age + ", Address: " + this.address;
    }
}

