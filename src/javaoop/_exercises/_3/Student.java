package javaoop._exercises._3;

public class Student {

    private String name = null;
    private String surname = null;
    private int age;
    private int roomNumber;

    private int idNumber;

    private int howManyAgeValues = 0;

    Student(String name, String surname, int age, int roomNumber, int idNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.roomNumber = roomNumber;
        this.idNumber = idNumber;

    }



    public void setName(String name) {
        if (name.length() > 10) {
            System.out.println("Too many characters, try again");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("Cannot set, try again later");
        }
    }


    public int getAge(){
        howManyAgeValues = howManyAgeValues + 1;
        return this.age;
    }

    public int getHowManyAgeValues(){
       return this.howManyAgeValues;
    }

    public void setRoom(int roomNumber) {
        if (roomNumber > 200) {
            System.out.println("invalid number");
        } else {
        this.roomNumber = roomNumber;
        }
    }

    public int getRoom() {
        return this.roomNumber;
    }

    public void setIdNumber(int idNumber) {
        if (idNumber > 999999) {
            System.out.println("Invalid value");
        } else {
            this.idNumber = idNumber;
        }
    }

    public int getIdNumber() {
        return this.idNumber;
    }



}


