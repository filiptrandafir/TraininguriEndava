package colections.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Compile and run. What's the problem?
 * 
 * @author George Trandafir
 * 
 */

public class Ex1 {
	public static void main(String[] args) {
		Graduate graduate1 = new Graduate(2);
		Graduate graduate2 = new Graduate(2);
		Set<Graduate> set = new TreeSet<>();
		
		set.add(graduate1);
		set.add(graduate2);
		for (Graduate graduate : set) {
			System.out.println(graduate);
		}
	}
}

//we need to implement the compareTo method
class Graduate implements Comparable<Graduate>{
	private Integer age;

	public Graduate(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Graduate [age=" + age + "]";
	}

	@Override
	public int compareTo(Graduate graduate) {
		// TODO Auto-generated method stub
		return this.age - graduate.age;
	}
	
	
}
