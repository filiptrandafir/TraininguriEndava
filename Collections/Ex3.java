package colections.exercises;

import java.util.Iterator;

/**
 * Lets make our own iterable collection. We want to be able to write a
 * "foreach" on our collection. Solution?
 *
 * @author George Trandafir
 *
 */

//my solution was to implement and Iterator for my class
public class Ex3 {

    public static void main(String[] args) {
        Town<String> myTown = new Town<>();      
        for (String town : myTown) {
        	System.out.println(town);
        }
    }
}

class Town<T> implements Iterable<T> {
    private T type;

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}