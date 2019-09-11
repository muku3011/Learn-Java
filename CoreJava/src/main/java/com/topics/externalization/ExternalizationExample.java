package com.topics.externalization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Objects;

public class ExternalizationExample {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Mukesh");
        employee.setAddress("New Delhi");
        employee.setNumber(995396621);
        employee.setSsn(123456);

        try (FileOutputStream fileOutputStream = new FileOutputStream(Objects.requireNonNull(ClassLoader.getSystemClassLoader().getResource("serialization_externalization/externalization")).getFile())) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            System.out.print("Serialized data is saved in /resources/serialization_externalization/externalization");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
