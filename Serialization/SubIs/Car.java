package Serialization;

public class Car{

	private String color;
	
	Car() {};

	Car (String color){
		this.color = color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}	
}