package com.topics.externalization;

import java.io.*;
import java.util.Objects;

public class DeExternalizationExample {

    public static void main(String[] args) {
        Employee employee;
        try (FileInputStream fileReader = new FileInputStream(Objects.requireNonNull(ClassLoader.getSystemClassLoader().getResource("serialization_externalization/externalization")).getFile())) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileReader);
            employee = (Employee) objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("De-Externalized Object");
        System.out.println("Name: " + employee.getName());
        System.out.println("Address: " + employee.getAddress());
        System.out.println("SSN: " + employee.getSsn());
        System.out.println("Number: " + employee.getNumber());
    }
}
