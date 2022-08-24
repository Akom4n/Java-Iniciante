package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class sintaxe_opcional2 {
	
	public static void main(String[] args) {
		/*
		 Estrutura switch-case
		 
		 Quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável.
		 Ajuda na substituição do encadeamento a base de if/else if.
		 */
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}

}
