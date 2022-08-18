import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ENGLISH);
		
		/*
		 Scanner sc = new Scanner(System.in);
	
		
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
			
			double n = 20.68;
			
			
			System.out.println("Digite o valor para somar: ");
			double soma = sc.nextDouble();
			
			if (soma > n)
			{
				System.out.println("Soma é maior que N: " + soma);
			}
			else
			{
				System.out.println("Soma é menor que N: " + n);
			}
		
		sc.close();
		
		
		
	}

}
