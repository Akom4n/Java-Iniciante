package vetores;

import java.util.Locale;
import java.util.Scanner;

public class vetores_ini {
	
	public static void main(String[] args) {
		
		/*
		 * Vetores:
		  
		  Um vetor corresponde a uma coleção de dados de tamanho fixo, indexada, unidimensional e homogêneo
		  
		 	* Indexada: os elementos são acessados por meio de índices

		 	* Unidimensional: uma dimensão.	 
		 	 
		 	* Homogênea: todos dados são do mesmo tipo
		 	
		 	
		 	0 Maria
		 	1 João
		 	2 Carlos
		 	3 Ana 
		 	4 Joaquim
		 		A
		 	
		 Vetores são também chamados de arranjos unidimensionais
		 
		 Em java a primeira posição de um vetor é a posição 0
		 
		 Um arranjo deve ser alocado previamente, antes de ser utilizado. Uma vez alocado, sua quantidade de elementos é fixa.
		 
		 	
		 Como criar um vetor?
		 			
		  		     int[] A; 
		 declaração: double[] B;
		 			 String[] C;
		 			 
		 			   A = new int[10];
		 instanciação: B = new double[5];
		 			   C = new String[8];
		 			   
		 Como acessar os elementos de um vetor?
		 
		 A[3] = 10;
		 
		 for (int i=0; i<5; i++) {
		 	B[i] = i + 10;
		 }
		 
		 C[1] = "Maria";
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double [] vet = new double[N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
		}
		
		for (int i=0; i<N; i++) {
			System.out.printf("%.2f%n", vet[i]);
		}
		
		
		sc.close();
		
		
	}

}
