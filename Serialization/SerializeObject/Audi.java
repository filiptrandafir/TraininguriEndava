package Serialization;

import java.io.Serializable;

public class Audi implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	
	Audi (String name){
		this.name = name;
	}
	
	public void setName (String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
