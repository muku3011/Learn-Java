package com.ocp.topics.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationExample {

    public static void main(String[] args) {
        SerializedEmployee serializedEmployee;
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/serialization_externalization/serialization");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            serializedEmployee = (SerializedEmployee) objectInputStream.readObject();
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
        System.out.println("Name: " + serializedEmployee.getName());
        System.out.println("Address: " + serializedEmployee.getAddress());
        System.out.println("SSN: " + serializedEmployee.getSsn());
        System.out.println("Number: " + serializedEmployee.getNumber());
        System.out.println("SSN ID: " + serializedEmployee.getSsn_id());
    }
}
