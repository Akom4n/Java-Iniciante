package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri1017 {
	
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	
	int temp, vel;
	double litros;
	
	temp = sc.nextInt();
	vel = sc.nextInt();
	
	 litros = (double)temp * vel / 12.0;
	 
	 System.out.printf("%.3f%n", litros);
	
	
	
	sc.close();
	}

}
