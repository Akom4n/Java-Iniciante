package estrutura_condicional;

import java.util.Scanner;

public class estrutura_condicional {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 
		 CONCEITO:
		 
		 Estrutura condicional: 
		 
		 É uma estrutura de controle que permite definir que um certo bloco e comandos somente será executado dependendo de uma condição
		 
		 exemplo:
		 
		 
		 Baseado no fluxo da condição você pode definir para qual bloco de comando vai
		 Condição V = bloco 1 ou Condição F = bloco 2
		 
		 Sintaxe da estrutura condicional:
		 
		 Simples:
		 
		 if	(<condição>) {
		 	<comando 1>
		 	<comando 2>
		 }
		 
		 Composta:
		 
		 if	(<condição>) {
		 	<comando 1>
		 	<comando 2>
		 }
		 else if {
		 	<comando 3>
		 	<comando 4>
		 }
		 
		 */
		/*
		
		Simples:
		
		int x = 5;
		
		System.out.println("Bom dia");
		
		if (x < 0) {		
			System.out.println("Boa tarde");	
		}
		
		System.out.println("Boa noite");
		*/
		//REGRA: Caso verdadeira ela executa o bloco de comandos | Caso falsa ela pula o bloco de comandos
		
		int hora;
	
		System.out.println("Quantas horas: ");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		}
		else if(hora < 18){
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa noite");
		}
		
		
		/*
		 E se eu tiver mais de duas possibilidades?
		 
		 horas < 12 -- bom dia
		 
		 12 <= horas < 18 -- boa tarde
		 
		 horas >= 18 -- boa noite
		 
	  	 Encadeamento de estruturas condicionais
	  	 
	  	 if ( condição 1) {
	  	 	comando 1
	  	 	comando 2
	  	 }
	  	 else {
	  	 	if(condição 2){
	  	 		comando 3
	  	 		comando 4
	  	 	}
	  	 	else {
	  	 		comando 5
	  	 		comando 6
	  	 	}
	  	 }
	  	 
		 * 
		 */
				
		sc.close();
		
		
	}

}
