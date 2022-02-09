package com.company;

public class Programmer extends Person {
    private String companyName;


    @Override
    public String toString() {
        System.out.println("Programmer info:");
        return "name:" + name + "\ndesignation:" + designation + "\ncompanyName:" + companyName;
    }

    public Programmer() {
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;

    }

    public void coding() {
        super.learn();
        super.walk();
        super.eat();
        System.out.println(name + " coding java programs");
    }
}

