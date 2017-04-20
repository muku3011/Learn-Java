package com.topics.design_pattern.structural;

import java.util.ArrayList;
import java.util.List;

class RunComposite {

    public static void main(String[] args) {
        Component hdd = new Leaf(5000, "HDD");
        Component mouse = new Leaf(200, "MOUSE");
        Component monitor = new Leaf(12000, "MONITOR");
        Component ram = new Leaf(3400, "RAM");
        Component cpu = new Leaf(8000, "CPU");

        Composite peri = new Composite("PERI");
        Composite cabinet = new Composite("CABINET");
        Composite mb = new Composite("MB");
        Composite computer = new Composite("COMPUTER");

        peri.addComponent(mouse);
        peri.addComponent(monitor);

        mb.addComponent(cpu);
        mb.addComponent(ram);

        cabinet.addComponent(hdd);
        cabinet.addComponent(mb);

        computer.addComponent(peri);
        computer.addComponent(mb);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}

interface Component {
    void showPrice();
}

class Leaf implements Component {

    private int price;
    private String name;

    Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println("Name : " + name + " Price : " + price);
    }
}

public class Composite implements Component {

    private String name;

    Composite(String name) {
        this.name = name;
    }

    private List<Component> components = new ArrayList<>();

    void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println(name);

        for (Component c : components) {
            c.showPrice();
        }
    }
}