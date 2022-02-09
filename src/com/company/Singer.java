package com.company;

public class Singer extends Person {
    private String bandGroup;

    @Override
    public String toString() {
        System.out.println("Singer info:");
        return "name:" + name + "\ndesignation:" + designation + "\nbandGroup:" + bandGroup;

    }

    public Singer() {
    }

    public Singer(String name, String designation, String bandGroup) {
        super(name, designation);
        this.bandGroup = bandGroup;
    }

    public String getBandGroup() {
        return bandGroup;

    }

    public void setBandGroup(String bandGroup) {
        this.bandGroup = bandGroup;
    }

    public void singing() {
        super.learn();
        super.walk();
        super.eat();
        System.out.println(name + " singing very well");
    }

    public void playGitar() {
        System.out.println(name + " play with gitar a popular music");
    }
}
