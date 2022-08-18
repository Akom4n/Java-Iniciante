package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1002 {
	
	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
	        
	        double n = 3.14159;
	        double raio, Area;
	        
	        raio = sc.nextDouble();
	        
	        Area = Math.pow(raio, 2.0);
	        
	        System.out.printf("A=%.4f%n", n * Area);
	        
	        sc.close();
	 
	}
}
