package Serialization;

import java.io.*;

public class Implementation {
	
	public static void main (String[] args){
		Audi carType = new Audi("A8");
		Car car = new Car(carType, "red");
		
		
		//Serialize Audi
		try { 
			FileOutputStream fileOutputStream = new FileOutputStream("serialCar.ser");  
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);  
			objectOutputStream.writeObject(car);  
		} 
		catch (FileNotFoundException e) {  
			   e.printStackTrace();  
		} 
		catch (IOException ioe) {  
			   ioe.printStackTrace();  
	   } 
		
		//Deserialize Audi
		Car carDeserialized = null;
		 try {
			 FileInputStream fileInputStream = new FileInputStream("serialCar.ser");  
			 ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);  
			 carDeserialized = (Car) inputStream.readObject();  
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
		 System.out.println("Printing value of Deserialized Car's instance :");  
		 System.out.println("Color = " + carDeserialized.getColor() + "; Name = " + carDeserialized.getAudi().getName());  
	}
}
