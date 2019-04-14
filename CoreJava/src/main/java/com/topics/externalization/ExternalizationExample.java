package com.topics.externalization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExternalizationExample {

    public static void main(String[] args) {
        ExternalizedEmployee externalizedEmployee = new ExternalizedEmployee();
        externalizedEmployee.setName("Mukesh");
        externalizedEmployee.setAddress("New Delhi");
        externalizedEmployee.setNumber(995396621);
        externalizedEmployee.setSsn(123456);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/serialization_externalization/externalization");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(externalizedEmployee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.printf("Serialized data is saved in /resources/serialization_externalization/externalization");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
