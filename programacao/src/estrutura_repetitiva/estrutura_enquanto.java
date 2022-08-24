package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class estrutura_enquanto {
	
	public static void main(String[] args) {
		
		/*
		 * É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira
		 * 
		 * Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada.
		 * 
		 * exemplo
		 * 
		 * while ( condição ) {
		 * 		comando 1
		 * 		comando 2
		 *  }
		 *  
		 *  regras: quando verdadeiro executa e volta e quando falso ele pula fora.
		 *
		 *
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
