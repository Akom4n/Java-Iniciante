package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex_resolvido1 {
	
	//Estrutura condicional simples, exercicio 1
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, resultado;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		
		resultado = nota1 + nota2;
		System.out.printf("NOTA FINAL = %.1f%n", resultado);
		
		if (resultado < 60) {
			System.out.println("REPROVADO");
		}	
		
		sc.close();
	}

}
