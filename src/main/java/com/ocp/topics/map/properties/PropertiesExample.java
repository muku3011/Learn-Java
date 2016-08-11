package com.ocp.topics.map.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * The properties object contains key and value pair both as a string. It is the subclass of Hashtable.
 * 
 * It can be used to get property value based on the property key.
 * The Properties class provides methods to get data from properties file and store data into properties file.
 * Moreover, it can be used to get properties of system.
 */
public class PropertiesExample
{
	public static void main(String args[]) throws IOException  {
	    System.out.println("Properties from file : ");
		getPropertiesFromFile();
		System.out.println("System properties : ");
		getSystemProperties();
	}

	private static void getPropertiesFromFile() throws IOException {
		FileReader fileReader=new FileReader("resource/db.properties");  
	      
	    Properties properties=new Properties();  
	    properties.load(fileReader);  
	      
	    System.out.println(properties.getProperty("user"));  
	    System.out.println(properties.getProperty("password"));  
	}  
	
	private static void getSystemProperties() {
		Properties properties=System.getProperties();  
		Set<Entry<Object, Object>> set = properties.entrySet();  
	  
		Iterator<Entry<Object, Object>> iterator = set.iterator();  
		
		while(iterator.hasNext()){  
			Entry<Object, Object> entry = iterator.next();
			System.out.println(entry.getKey()+" = "+entry.getValue());  
		}  
	}
}
