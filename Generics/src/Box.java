public class Box <T>  {
    // T stands for "Type"
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
    
    
    public static void main (String[] args){
    	Box <Integer> a = new Box <Integer>();
    	a.set(3);
    	System.out.println(a.get());
    	
    	Box <String> b = new Box<String>();
    	b.set("Hello!");
    	System.out.println(b.get());
    }
}
