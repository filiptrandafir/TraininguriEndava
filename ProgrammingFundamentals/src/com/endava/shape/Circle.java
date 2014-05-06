package com.endava.shape;
import java.lang.Math;

public class Circle extends Shape {
	
	private int radius;
	
	Circle(){
		System.out.println("Circle constructor");
	};
	
	public int computeArea() {
		return (int) (Math.PI * getRadius() * getRadius()); 
	}
	
	int getRadius() {return radius;};
	void setRadius(int a) {radius = a;};
	
	public void helloWorld ()
	{
		super.helloWorld();
		System.out.println("Hello world from Circle");
	}
}
