package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class estrutura_para {
	
	public static void main(String[] args) {
		
		/*
		 * É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
		 * 
		 * Quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de vlores.
		 * 
		 * Explicação:
		 * 
		 * Sintaxe/regra
		 * 
		 * inicio: executa somente na primeira vez.
		 * condição: Verdadeiro executa e volta, caso falso pula fora
		 * incremento: executa toda vez depois que voltar
		 * 
		 * for (inicio; condição ; incremento) {
		 * 		comando 1
		 * 		comando 2
		 * }
		 * 
		 * importante: 
		 * Perceba que a estrutura "para" é otima para se fazer uma repetição baseada em uma contagem:
		 * 
		 * for (int i=0; i<5; i++){
		 * 		System.out.println("Valor de i: " + i);
		 * }
		 * 
		 * Contagem regressiva
		 * 
		 * for (int i=4; i>=0; i--){
		 * 		System.out.println("Valor de i: " + i;
		 * }
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
