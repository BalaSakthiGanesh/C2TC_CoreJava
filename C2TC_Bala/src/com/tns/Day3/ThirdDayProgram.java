package com.tns.Day3;

class ThirdDayProgram {
    // Private variables (Encapsulated fields)
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        // Adding validation in the setter method
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the ThirdDayProgram class
        ThirdDayProgram person = new ThirdDayProgram();

        // Setting values using setter methods
        person.setName("Bala");
        person.setAge(21);

        // Accessing values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Trying to set an invalid age
        person.setAge(-10);  // This will print an error message due to the validation in the setter method
       
    }
}
