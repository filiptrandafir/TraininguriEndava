package Serialization;

import java.io.Serializable;

public class Car implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String color;
	private Audi carAudi;

	public Car (Audi carAudi, String color){
		this.carAudi = carAudi;
		this.color = color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}	
	
	public Audi getAudi (){
		return carAudi;
	}
}