package estrutura_condicional;

public class expressoes_logicas {
	
	public static void main(String[] args) {
		
		/*
		Expressões lógicas
		
		Expressao RESULTADO valor verdade
		
		OPERADORES LOGICOS: C, C++, JAVA, C#
		
		OPERADOR	SIGNIFICADO
		
		&&			E
		||			OU
		!			NÃO
		
		Ideia por trás do operador "E"
		
		Você pode obter uma habilitação de motorista se:
		
		° For aprovado no exame psicotécnico,
		E
		° For aprovado no exame de legislação,
		E
		° For aprovado no exame de direção
		
		(TODAS AS CONDIÇÕES DEVEM SER VERDADEIRAS)
		
		Exemplos de expressões logicas:
		
		(suponha x igual a 5)
		
		x <= 20(V) && x == 10(F) Resultado = F
		
		x > 0(V) && x != 3(V) Resultado = V
		
		x <= 20(V) && x == 10(F) && X != 3(V) Resultado = F
		
		TABELA VERDADE DO OPERADOR "E"
		
		A B  A&&B
		F F = F
		F V = F
		V F = F
		V V = V
		
		IDEIA POR TRÁS DO OPERADOR "OU"
		
		Você pode estacionar na vaga especial se:
		
		° For idoso(a),
		OU
		° For uma pessoa com deficiência,
		OU
		° For uma gestante
		
		(PELO MENOS UMA CONDIÇÃO DEVE SER VERDADEIRA)
		
		Exemplos de expressões lógicas
		
		(suponha x igual a 5)
		
		x == 10(F) || x <= 20(V) Resultado: V
		
		x > 0(V) || x != 3(V) Resultado: V
		
		x <= 0(F) || x != 3(V) || x != 5(F) Resultado: V
		
		TABELA VERDADE DO OPERADOR "OU"
		
		A B  A&&B
		F F = F
		F V = V
		V F = V
		V V = V
		
		IDEIA POR TRÁS DO OPERADOR "NÃO"
		
		Você tem direito a receber uma bolsa de estudos se você:
		
		NÃO
		° Possuir renda maior que $ 3000,00
		
		Exemplos de expressões lógicas
		
		(suponha x igual a 5)
		
		!(x == 10(F)) Resultado = V //a expressão era falsa, porem como o não estava na frente se torna verdadeira
		
		!(x >= 2(V)) Resultado = F //a expressão era verdadeira porem como o não estava na frente se torna falsa
		
		!(x <= 20(V) && x == 10(F)) Resultado = V //Como uma condição era falsa e uma verdadeira, ele automaticamente foi pra falso, porem com o não na frente ele se torna verdadeiro.
		
		(TODAS AS CONDIÇÕES DEVEM SER VERDADEIRAS)
		
		TABELA VERDADE DO OPERADOR "NÃO"
		
		A !A
		F  V
		V  F
		
		*/
	}

}
