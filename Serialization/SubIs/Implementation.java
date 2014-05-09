package Serialization;

import java.io.*;

public class Implementation {
	
	public static void main (String[] args){
		Car car = new Car("red");
		Audi carType = new Audi("blue", "A8");
		
		//Serialize Audi
		try { 
			FileOutputStream fileOutputStream = new FileOutputStream("serialAudi.ser");  
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);  
			objectOutputStream.writeObject(carType);  
		} 
		catch (FileNotFoundException e) {  
			   e.printStackTrace();  
		} 
		catch (IOException ioe) {  
			   ioe.printStackTrace();  
	   } 
		
		//Deserialize Audi
		Audi carTypeDeserialized = null;
		 try {
			 FileInputStream fileInputStream = new FileInputStream("serialAudi.ser");  
			 ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);  
			 carTypeDeserialized = (Audi) inputStream.readObject();  
		} 
		 catch (FileNotFoundException e) {  
			   e.printStackTrace();  
		} 
		 catch (IOException ioe) {  
			   ioe.printStackTrace();  
		} 
		 catch (ClassNotFoundException cnf) {  
			   cnf.printStackTrace();  
		}  
			  
		//Print the values obtained
		 System.out.println("Printing value of Deserialized Audi's instance :");  
		 System.out.println("Color = " + carTypeDeserialized.getColor() + "; Name =  " + carTypeDeserialized.getName());  
	}
}
