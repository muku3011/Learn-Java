package com.topics.design_pattern.creational.abstract_factory;


public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}