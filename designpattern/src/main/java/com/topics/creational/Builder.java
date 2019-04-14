package com.topics.creational;

public class Builder {

    //Builder for Phone object

    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public Builder setOs(String os) {
        this.os = os;
        return this;
    }

    public Builder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Builder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public Builder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Builder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone() {
        return new Phone(os, ram, processor, screenSize, battery);
    }
}

class Phone {

    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;


    public Phone(String os, int ram, String processor, double screenSize, int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}

class RunBuilder {

    public static void main(String[] args) {
        Phone phone1 = new Builder().getPhone();
        System.out.println(phone1);

        Phone phone2 = new Builder().setOs("Android").setRam(4).setScreenSize(5.2).getPhone();
        System.out.println(phone2);

        Phone phone3 = new Builder().setOs("iOS").setBattery(3100).setProcessor("Snapdragon").setRam(4).setScreenSize(5.2).getPhone();
        System.out.println(phone3);
    }
}