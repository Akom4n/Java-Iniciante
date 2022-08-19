package Exercicio_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int z = sc.nextInt();	
		
		if (x > z) {
					
			System.out.println("O maior número é = " + x);
		}
		else {
			System.out.println("O maior número é = " + z);
		}
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a < b) {
			System.out.printf("%.2f é menor do que %.2f %n", a, b);
		}
		else {
			System.out.printf("%.2f é menor do que %.2f %n" , b, a);
		}
		
		
		
		sc.close();
		
	}
}
