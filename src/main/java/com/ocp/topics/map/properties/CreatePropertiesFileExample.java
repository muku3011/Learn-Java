package com.ocp.topics.map.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * The properties object contains key and value pair both as a string. It is the subclass of Hashtable.
 * 
 * It can be used to get property value based on the property key.
 * The Properties class provides methods to get data from properties file and store data into properties file.
 * Moreover, it can be used to get properties of system.
 */
public class CreatePropertiesFileExample
{
	public static void main(String args[]) throws IOException  {
	    System.out.println("Properties from file : ");
		getPropertiesFromFile();
	}

	private static void getPropertiesFromFile() throws IOException {
		FileReader fileReader = new FileReader("src/main/resources/properties/read.properties");

	    Properties properties=new Properties();
	    properties.load(fileReader);

	    System.out.println(properties.getProperty("user"));
	    System.out.println(properties.getProperty("password"));

		FileWriter fileWriter = new FileWriter("src/main/resources/properties/write.properties");

        properties.setProperty("user","Created User");
	    properties.setProperty("password","Created Password");  
	    
	    properties.store(fileWriter, "Java write properties example");
	}  
	
}
