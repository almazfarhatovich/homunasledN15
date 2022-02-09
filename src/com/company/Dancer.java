package com.company;

public class Dancer extends Person {
    private String groupName;

    @Override
    public String toString() {
        System.out.println("Dancer info:");
        return "name:" + name + "\ndesignation:" + designation + "\ngroupName:" + groupName;
    }

    public Dancer() {
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing() {
        super.learn();
        super.walk();
        super.eat();
        System.out.println(name + " dancing Lezginka");
    }
}
