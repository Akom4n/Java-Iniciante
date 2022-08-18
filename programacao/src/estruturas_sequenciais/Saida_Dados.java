package estruturas_sequenciais;

import java.util.Locale;

public class Saida_Dados {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int y = 32;
		double x = 10.35784;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println("Bom dia!");
		System.out.println(y);
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade,renda);
		
		/*
		Controle das casas decimais:
		
		%n = quebra e linha(independente de plataforma)
		
		System.out.printf("%.2f%n", x); Especificando que quero duas casas decimais
		
		System.out.printf("%.4f%n", x); Especificando que quero quatro casas decimais
		
		Atenção: Para considerar o separador de decimais como ponto, ANTES da declaração do Scanner, faça:
		
		Locale.setDefault(Locale.US);
		
		Para concatenas varios elementos em um mesmo comando de escrita
		
		Regra geral para print e println:
		
		elemento1 + elemento2 + elemento3 + ... + elementoN
		
		System.out.println("RESULTADO = " + x + "METROS");
		
		Regra geral para printf:
		
		"texto1 %f texto2 %f texto3", variavel1, variavel2";
		
		%f = ponto flutuante(DOUBLE) / %n = quebra de linha
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		%d = inteiro(INT) / %s = texto(STRING)
		
		
		*/
		
		
		
	}
}
