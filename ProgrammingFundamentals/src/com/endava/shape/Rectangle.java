package com.endava.shape;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	Rectangle () {
		System.out.println("Rectangle constructor");
	};
	
	public int computeArea() {return getWidth() * getHeight();};
	
	int getWidth(){return width;};
	int getHeight(){return height;}
	void setWidth(int a){width = a;}
	void setHeight(int b){height = b;}
	
	public void helloWorld ()
	{
		super.helloWorld();
		System.out.println("Hello world from Rectangle");
	}
}
