package com.topics.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Objects;

public class DeSerializationExample {

    public static void main(String[] args) {
        Employee employee;
        try {
            FileInputStream fileInputStream = new FileInputStream( Objects.requireNonNull(ClassLoader.getSystemClassLoader().getResource("serialization_externalization/serialization")).getFile());
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("ExternalizedEmployee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("De-serialized ExternalizedEmployee...");
        System.out.println("Name: " + employee.getName());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("SSN: " + employee.getSsn());
        System.out.println("Number: " + employee.getNumber());
        System.out.println("SSN ID: " + employee.getSsn_id());
    }
}
