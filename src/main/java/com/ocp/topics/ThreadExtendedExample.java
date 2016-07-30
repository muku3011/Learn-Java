package com.ocp.topics;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Remember, multi-catch is only for exceptions in different inheritance hierarchies.
 */
public class ThreadExtendedExample {

    public static void main(String[] args) throws SQLException, IOException {
        new ThreadExtendedExample().exceptionHandling();


    }

    private void exceptionHandling()throws SQLException, IOException {
        try {

            clone();
            super.clone();
            //Access the database and write to a file
            couldThrowAnException();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
                            // Re throw exception
            //throw e;        // note: won't compile in Java 6
        }
    }

    private void couldThrowAnException() throws SQLException, IOException {

    }


}
