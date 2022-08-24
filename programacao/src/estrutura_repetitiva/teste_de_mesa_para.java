package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class teste_de_mesa_para {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x = 3;
		int y = 0;
		
		for (int i=0; i < x; i++) {
			System.out.print(i + ",");
			y += 5;
			System.out.println(y);
		}
		
		sc.close();
	}

}
