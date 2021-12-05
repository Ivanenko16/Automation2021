package javaBasicPart2;

public class Computer {

    String brand;
    String screenSize;
    String type;
    int numberOfCourse;

    public Computer(String brand, String screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    Computer computer1 = new Computer("Apple","1920*1080");
    Computer computer2 = new Computer("Xiaomi","1680*1050");

}
