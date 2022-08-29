package vetores;

import java.util.Locale;
import java.util.Scanner;

public class sintaxe_opcional_paracada {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] nomes = new String[N];
		
		for(int i=0; i<N; i++) {
			nomes[i] = sc.next();
		}
		
		System.out.println("nomes lidos:");
		
		//Substituindo o i e colocando o string s(pode ser substituido pelo que você quiser)
		for(String s: nomes) {
			System.out.println(s);
		}
		
		
		sc.close();
	}

}
