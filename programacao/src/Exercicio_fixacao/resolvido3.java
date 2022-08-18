package Exercicio_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class resolvido3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		
		double media = (double)(idade1 + idade2) / 2; //botar o 2 para 2.0 também funcionaria pois forcaria o compilador a reconhecer o double
		
		System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);
		
		
		sc.close();
		
	}

}
