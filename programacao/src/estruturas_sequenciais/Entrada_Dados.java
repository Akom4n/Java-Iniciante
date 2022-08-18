package estruturas_sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Entrada_Dados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		/*
		Scanner: Para fazer entrdaaa de dados, vamos usar um objeto do tipo Scanner da seguinte forma:
		
		Scanner sc = new Scanner(System.in);
		
		e no fim do codigo você tem que fazer um 
		
		sc.close();
		
		Suponha uma variavel tipo String declarada:
		
		String x;
		
		x = sc.next();	 
		
		Suponha agora uma var de numero inteiro
		
		int x;
		
		x = sc.nextInt();
		
		Agora para ler um numero com ponto flutuante
		
		double x;
		
		x = sc.nextDouble(); //OBSERVAÇÃO, ELE USA A LOCALIDADE DO SISTEMA, VIRGULA OU PONTO.
		
		Para ler um caractere 
		
		char x;
		
		x = sc.next().charAt(0);
		
		PARA LER ESSES DADOS JUNTOS É SIMPLESMENTE DECLARAR E LER CADA VAR DE FORMA INDEPENDENTE
		*/
		
		/*Exemplos:
		Scanner sc = new Scanner(System.in);
		
		String x;
		int b;
		double y;
		char a;
		x = sc.next();
		b = sc.nextInt();
		y = sc.nextDouble();
		a = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + x);
		System.out.println(b);
		System.out.println(y);
		System.out.println(a);
		
		sc.close();
		*/
		
		//ENTRADA DE DADOS 2.0: Para ler um texto ATÉ QUEBRA DE LINHA
		
		//QUANDO VC USA UM COMANDO DE LEITURA DIFERENTE DO NEXTLINE() E DÁ ALGUMA QUEBRA DE LINHA, ESSA QUEBRA DE LINHA FICA "PENDENTE" NA ENTRADA PADRÃO.
		//Se você fizer um nextline(), aquela quebra de linha pendente será absorvida pelo nextLine();
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1,s2,s3;
		
		x = sc.nextInt(); 
		sc.nextLine();
		s1 = sc.nextLine(); //NextLine para ler todo o texto
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}
