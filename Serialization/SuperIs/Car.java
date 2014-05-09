package Serialization;

import java.io.Serializable;

public class Car implements Serializable{

	//used for version control of object; helps recover the state of serialized object
	private static final long serialVersionUID = 1L;
	private String color;

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