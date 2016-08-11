package com.ocp.topics.serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        SerializedEmployee serializedEmployee = new SerializedEmployee();
        serializedEmployee.setName("Mukesh");
        serializedEmployee.setAddress("New Delhi");
        serializedEmployee.setNumber(995396621);
        serializedEmployee.setSsn(123456);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/serialization_externalization/serialization");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(serializedEmployee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.printf("Serialized data is saved in /resources/serialization_externalization/serialization");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

