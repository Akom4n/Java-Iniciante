package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes_ini {
	
	public static void main(String[] args) {
		
		/*
		   MATRIZES:
		   Uma matriz corresponde a uma coleção de dados de tamanho fixo, indexada, bidimensional e homogênea
		  
		 * Indexada: os elementos são caessados por meio de índices
		 
		 * Bidimensional: duas dimensões
		  
		 * Homogênea: todos dados são do mesmo tipo
		 
		   Matrizes são também chamadas de arranjos bidimensionais
		   
		   Em Java a primeira posição de uma matriz é a posição 0,0(linha 0, coluna 0)
		   
		   Um arranjo deve ser alocado previmente, antes de ser utilizado. Uma vez alocado, sua quantidade de elementos é fixa
		   
		   COMO CRIAR UMA MATRIZ?
		   
		   Declaração: double[][] A;
		   
		   Instanciação: A = new double[3][4];
		   
		   COMO ACESSAR OS ELEMENTOS DE UMA MATRIZ?
		   
		   A[1][2] = 10;
		   
		 */
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		
		for (int i=0; i<M; i++){
			for (int j=0; j<N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<M; i++){
			for (int j=0; j<N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
