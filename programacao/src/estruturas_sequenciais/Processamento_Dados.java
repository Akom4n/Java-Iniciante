package estruturas_sequenciais;

public class Processamento_Dados {
	
	public static void main(String[] args) {
		
		/*
		 
		 Comando de atribuição: 
		 
		 
		 Sintaxe: 
		 
		 variavel = expressão;
		 
		 regra: 
		 1 - A expressão é calculada.
		 2 - o resultado da expressão é armazenado na variavel.
		 
		 
		 BOA PRATICA: Sempre indique o tipo de número, se a expressão for de ponto flutuante(não inteira)
		 para double use: .0
		 
		 para float use: f
		 
		 CASTING:
		 casting é quando você faz uma conversão dos dados de um valor inteiro para flutuante ou o contrario os colocando entre parenteses antes da var.
		 (double) or (int) 
		 
		 */
		
		/*
		Exemplo 1:
		
		int x,y;
		 
		 x = 5;
		 
		 y = 2 * x;
		 
		 System.out.println(x);
		 System.out.println(y);
		*/
		
		/*
		 Exemplo 2:
		 
		 int x;
		 double y;
		 
		 x = 5;
		 
		 y = 2 * x;
		 
		 System.out.println(x);
		 System.out.println(y);
		 */
		
		/*Exemplo 3:
		
		double b, B, h, area;
		 
		 
		 b = 6.0;
		 B = 8.0;
		 h = 5.0;
		 
		 area = (b + B) / 2.0 * h;
		 
		 System.out.println(area);
		*/
		
		/*Exemplo 4:
		
		int a,b; //Sendo int ela corta as casas decimais e não resulta em numero double e sim inteiro
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double)a / b; //Deveria dar 2.5, porem sem o double na frente fica 2.0 pois as var são inteiras
		
		System.out.println(resultado);
		*/
		
		//Exemplo 5:
		
		double a;
		int b;
		
		a = 5.0;
		b = (int)a; //Tentando converter a variavel de double para int com o casting
		
		System.out.println(b);
	}

}
