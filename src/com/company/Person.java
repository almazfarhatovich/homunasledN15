package com.company;

public abstract class Person {
    String name;
    String designation;

    public Person() {
    }

    @Override
    public String toString() {
        return name + " " + designation;
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void learn() {
        System.out.println(name + " is learning live");
    }

    void walk() {
        System.out.println(name + " walks to the green park");
    }

    void eat() {
        System.out.println(name + " eats kuurdak");

    }
}
