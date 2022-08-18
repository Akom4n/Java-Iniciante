
public class strings {
	
	public static void main(String[] args) {
		
		/* check list
		
		Formatar: 
		*	toLowerCase() - Deixa a formatação da String em minuscula.
		*	toUpperCase() - Deixa a formatação da String em maiuscula.
		*	trim() - Tira o espaçamento do inicio e fim da String.
		
		Recortar: Recortar a string
		*	substring(inicio)
		*	substring(inicio,, fim) 
		
		Substituir: Substitui caracteres ou a string
		*	Replace(char, char)
		*	Replace(string, string)
		
		Buscar: buscar a posição da string
		*	IndexOf (primeira)
		*	LastIndexOf (ultima)

		str.Split("") - Recortar o split com base no formatador que eu por dentro do paranteses
		
		
		*/
		
		//String original
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		//Split abaixo
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		
		//Formatações
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		//Demonstrações em funcionamento
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring: -" + s04 + "-");
		System.out.println("substring: -" + s05 + "-");
		System.out.println("Replace('a', 'x'): -" + s06 + "-");
		System.out.println("Replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': -" + i + "-");
		System.out.println("lastIndex of 'bc': -" + j + "-");
		
		//SPLIT
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
