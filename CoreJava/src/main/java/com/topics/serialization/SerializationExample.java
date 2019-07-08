package com.topics.serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Objects;

public class SerializationExample {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Mukesh");
        employee.setAddress("New Delhi");
        employee.setNumber(995396621);
        employee.setSsn(123456);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(Objects.requireNonNull(ClassLoader.getSystemClassLoader().getResource("serialization_externalization/serialization")).getFile());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.print("Serialized data is saved in /resources/serialization_externalization/serialization");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

