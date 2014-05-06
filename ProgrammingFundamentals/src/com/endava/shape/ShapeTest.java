package com.endava.shape;

public class ShapeTest {
	static Shape c = new Circle();
	static Shape t = new Triangle();
	static Shape r = new Rectangle();
	
	ShapeTest (){
		System.out.println("ShapeTest constructor");
	}
	
	int computeShapeArea (Shape x) {
		return x.computeArea();
	}
	
	public static void main (String[] args){
		ShapeTest test = new ShapeTest();
		
		((Circle)c).setRadius(2);
		System.out.println(test.computeShapeArea(c));
		((Circle)c).helloWorld();
		
		
		((Rectangle) r).setHeight(5);
		((Rectangle) r).setWidth(20);
		System.out.println(test.computeShapeArea(r));
		
		
		((Triangle) t).setSideA(9);
		((Triangle) t).setSideB(3);
		((Triangle) t).setSideC(7);
		System.out.println(test.computeShapeArea(t));
	}
}


