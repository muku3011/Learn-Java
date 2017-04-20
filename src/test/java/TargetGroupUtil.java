import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TargetGroupUtil {

    @Test
    public void createTargetGroup() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subscribers : ");
        int noOfSubscribers = sc.nextInt();
        sc.close();

        File file = null;
        if (noOfSubscribers > 0) {
            try {
                file = new File("D:\\TargetGroup_" + noOfSubscribers + ".txt");

                if (file.createNewFile()) {
                    System.out.println("File is created!");
                } else {
                    System.out.println("File already exists.");
                    PrintWriter writer = new PrintWriter(file);
                    writer.print("");
                    writer.close();
                    System.out.println("Cleared content of the file.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Enter value greater than 0 for target group !!");
            return;
        }
        PrintWriter writer;
        try {
            writer = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        while (noOfSubscribers > 0) {
            int number = (int) (Math.random() * 1000000000);
            writer.println(number);
            noOfSubscribers--;
        }
        writer.close();
        System.out.println("File created with name : " + file.getName() + "|| @ location : " + file.getPath());
    }
}