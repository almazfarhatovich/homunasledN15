package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Programmer programmer = new Programmer("Almaz", "Java Developer", "Growe");
        System.out.println(programmer);
        programmer.coding();
        System.out.println();
        Dancer dancer = new Dancer("Atai Omurzakov", "Hip-Hop dancer", "BTB");
        System.out.println(dancer);
        dancer.dancing();
        System.out.println();
        Singer singer = new Singer("Mirbek Atabekov", "singer", "odinokiy volk");
        System.out.println(singer);
        singer.singing();
        singer.playGitar();
    }
}
