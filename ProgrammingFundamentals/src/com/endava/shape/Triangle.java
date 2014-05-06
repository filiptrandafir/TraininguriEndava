package com.endava.shape;
import java.lang.Math;

public class Triangle extends Shape {
	private int sideA;
	private int sideB;
	private int sideC;
	
	Triangle () {
		System.out.println("Triangle constructor");
	};
	
	public int computeArea() {
		int  p = (getSideA() + getSideB() + getSideC())/3;
		return (int) Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));	
	}
	
	int getSideA(){return sideA;};
	int getSideB(){return sideB;};
	int getSideC(){return sideC;};
	
	void setSideA(int a){sideA = a;}
	void setSideB(int b){sideB = b;}
	void setSideC(int c){sideC = c;}
	
	public void helloWorld ()
	{
		super.helloWorld();
		System.out.println("Hello world from Triangle");
	}
}
