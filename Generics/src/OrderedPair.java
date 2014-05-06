public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
    
    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    
    public static void main (String[] args){
    	//OrderedPair<Integer, String> pair1 = new OrderedPair<Integer,String>(3, "Hello World");
    	//OrderedPair<String, String> pair2 = new OrderedPair<String,String>("Again", "Hello World");
    	
    	//System.out.println (pair1.getKey() + " " + pair1.getValue());
    	//System.out.println (pair2.getKey() + " " + pair2.getValue());
    	
    	OrderedPair<Integer, Integer> pair1 = new OrderedPair<Integer,Integer>(3, 4);
    	OrderedPair<Integer, Integer> pair2 = new OrderedPair<Integer, Integer>(3, 5);
    	
    	OrderedPair<Integer, Integer> pair3 = new OrderedPair<Integer,Integer>(3, 4);
    	OrderedPair<Integer, Integer> pair4 = new OrderedPair<Integer,Integer>(3, 4);
    	
    	boolean isNotTheSame = Util.<Integer, Integer>compare(pair1, pair2);
    	boolean isTheSame = Util.<Integer, Integer>compare(pair3, pair4);
    	
    	System.out.println(isNotTheSame + " " + isTheSame);
    	
    }
}
 
