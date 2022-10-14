package com.seriallize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) throws IOException 
	{
      Employee em = new Employee();
      
      em.setFirstName("Ganesh");
      em.setLastName("Lohokare");
      em.setEmpId(123);
     try 
     { 
     FileOutputStream fos = new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Demo.txt");
     ObjectOutputStream oos = new ObjectOutputStream(fos);
     oos.writeObject(em);
     }
     catch(Exception E)
     {
    	 System.out.println(E);
     }
     
   try {
    FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Demo.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Object obj = ois.readObject();
    Employee e = (Employee) obj ;
    System.out.println(" First Name = " + e.getFirstName());
    System.out.println("Last Name = " + e.getLastName());
    System.out.println("Employee Id = " + e.getEmpId());
    
   }
   catch(Exception E)
   {
	  System.out.println(E); 
   }
   System.out.println("After Seriallization and Deseriallization");
	
	}
}
