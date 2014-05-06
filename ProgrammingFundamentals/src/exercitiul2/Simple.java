package exercitiul2;

public class Simple {
	int i;
	int j;
	
	Simple() {System.out.println("Simple constructor");};
	
	Simple(int a){ a = i;};
	
	Simple(int a, int b){ 
		i = a;
		j = b;
		System.out.println("Value for i is " + i + " and value for j is " + j);
	};
}
