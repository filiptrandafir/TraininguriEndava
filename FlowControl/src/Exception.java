import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;


public class Exception {
	private static final Logger LOGGER = Logger.getLogger(Exception.class.getName());

	
	public static void writeList() {
		PrintWriter out = null;
		
		int [] vector = {2,3,4,5,8};
		int n = vector.length;

		try {
			out = new PrintWriter(new FileWriter("OutFile.txt"));
			for (int i=0; i<n; i++)
				System.out.println("Value at: "+i+"= "+vector[i+2]);		
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {
			LOGGER.info(e.getMessage());
			System.out.println("Valoarea indexului a fost depasita!");
		} 
		catch (IOException e){
			LOGGER.info(e.getMessage());
		}
		
		finally {
			if (out != null) 
				out.close();
		}
	}
	
	public static void main (String[] args){
		writeList();
	}
}
