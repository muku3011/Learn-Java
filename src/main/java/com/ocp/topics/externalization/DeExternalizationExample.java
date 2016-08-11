package com.ocp.topics.externalization;


import java.io.*;

public class DeExternalizationExample {

    public static void main(String[] args) {
        ExternalizedEmployee externalizedEmployee;
        try {
            FileInputStream fileReader = new FileInputStream("src/main/resources/serialization_externalization/externalization");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileReader);
            externalizedEmployee = (ExternalizedEmployee) objectInputStream.readObject();
            objectInputStream.close();
            fileReader.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("ExternalizedEmployee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("De-Externalized Object");
        System.out.println("Name: " + externalizedEmployee.getName());
        System.out.println("Address: " + externalizedEmployee.getAddress());
        System.out.println("SSN: " + externalizedEmployee.getSsn());
        System.out.println("Number: " + externalizedEmployee.getNumber());
    }
}
