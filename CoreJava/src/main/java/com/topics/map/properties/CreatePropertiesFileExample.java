package com.topics.map.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

/**
 * The db.properties object contains key and value pair both as a string. It is the subclass of Hashtable.
 * 
 * It can be used to get property value based on the property key.
 * The Properties class provides methods to get data from db.properties file and store data into db.properties file.
 * Moreover, it can be used to get db.properties of system.
 */
public class CreatePropertiesFileExample
{
	public static void main(String[] args) throws IOException  {
	    System.out.println("Properties from file : ");
		getPropertiesFromFile();
	}

	private static void getPropertiesFromFile() throws IOException {
		FileReader fileReader = new FileReader(Objects.requireNonNull(ClassLoader.getSystemClassLoader().getResource("properties/read.properties")).getFile());

	    Properties properties=new Properties();
	    properties.load(fileReader);

	    System.out.println(properties.getProperty("user"));
	    System.out.println(properties.getProperty("password"));

		FileWriter fileWriter = new FileWriter(Objects.requireNonNull(ClassLoader.getSystemClassLoader().getResource("properties/write.properties")).getFile());

        properties.setProperty("user","Created User");
	    properties.setProperty("password","Created Password");  
	    
	    properties.store(fileWriter, "Java write properties example");
	}  
	
}
