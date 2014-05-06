package exercitiul2;

public class ExtendedSimple extends Simple {
	ExtendedSimple(){
		super();
		System.out.println("“Hello world from a 0-ard constructor");
	};
	
	ExtendedSimple(int i){
		super(i);
		System.out.println("“Hello world from a 1-ard constructor");
	}
	
	ExtendedSimple(int i, int j){
		super (i,j);
		System.out.println("“Hello world from a 2-ard constructor");
	};
	
	public static void main (String[] args){
		ExtendedSimple s0 = new ExtendedSimple ();
		ExtendedSimple s1 = new ExtendedSimple (4);
		ExtendedSimple s2 = new ExtendedSimple (4,20);
	}
}
