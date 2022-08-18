import java.util.Scanner;

public class Funcao {

	public static void main(String[] args) {
		
		/*
		 SOBRE FUNÇÕES:
		  
			*Representam um processamento que possui um significado
				Math.sqrt(double) - Calcula a raiz quadrada de um valor.
				System.out.println(String) - Recebe uma String como argumento e o mostra na tela.
			
			*Principais vantagens: Modularização, Delegação e reaproveitamento
		 	
		 	*Dados de entrada e saída
		 		Funções podem receber dados de entrada (parâmentros ou argumentos)
		 		Funções podem ou não retornar uma saída
		 		
		 	*Em orientações a objetos, funções em classes recebem o nome de "métodos"
			
			
		*/
		
	
		//Exemplo 1
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		
		/*
		if(a > b && a > c) {
			System.out.println("Higher = " + a);
		}
		else if (b > c) {
			System.out.println("Higher = " + b);
		}
		else {
			System.out.println("Higher = " + c);
		}
		*/
		
		sc.close();
	}
	
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	
}
