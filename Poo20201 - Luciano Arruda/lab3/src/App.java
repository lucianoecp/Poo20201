public class App {

	public static void main(String[] args) {
		//String s = new String();
		//s = " complicado";

		//String s = new String("abcdef");
		String s = "abcdef";
		//String s2 = s;
		//String s2 = s.concat(" mais coisa");
		//String s2 = s;

		System.out.println("ola mundo " + s);

		//String x = "Java";
		//x.concat(" Rules!");
		//x = x.concat(" Rules!");
		//String x2 = x.concat(" Rules!");
		//System.out.println("x = " + x2); // a saida eh "x = Java"
        /*
		String x = "Java";
		x = x.concat(" Rules!");
		System.out.println("x = " + x); // a saida eh x = Java Rules!
		
		x.toLowerCase(); // sem atribuicao, cria uma nova string abandonada
		System.out.println("x = " + x); // sem atribuicao, a saida continua x = Java Rules!

		x = x.toLowerCase(); // cria uma nova string, atribuida a x
		System.out.println("x = " + x); // a atribuicao causa a saida x = java rules!

		String s1 = "spring ";
		String s2 = s1 + "summer ";
		s1.concat("fall ");
		s2.concat(s1);
		s1 += "winter ";
        System.out.println(s1 + " " + s2);
        */
        		//String s = new String();
		//s = " complicado";

		//String s = new String("abcdef");
		//String s = "abcdef";
		//String s2 = s;
		//String s2 = s.concat(" mais coisa");
		//String s2 = s;

		System.out.println("ola mundo " + s);

		//String x = "Java";
		//x.concat(" Rules!");
		//x = x.concat(" Rules!");
		//String x2 = x.concat(" Rules!");
		//System.out.println("x = " + x2); // a saida eh "x = Java"

		String x = "Java";
		x = x.concat(" Rules!");
		System.out.println("x = " + x); // a saida eh x = Java Rules!
		
		x.toLowerCase(); // sem atribuicao, cria uma nova string abandonada
		System.out.println("x = " + x); // sem atribuicao, a saida continua x = Java Rules!

		x = x.toLowerCase(); // cria uma nova string, atribuida a x
		System.out.println("x = " + x); // a atribuicao causa a saida x = java rules!

		String s1 = "spring ";
		String s2 = s1 + "summer ";
		s1.concat("fall ");
		s2.concat(s1);
		s1 += "winter ";
		System.out.println(s1 + " " + s2);

		x = "airplane";
		System.out.println(x.charAt(2)); // a saida eh ‘r’

		x = "taxi";
		System.out.println(x.concat(" cab")); // a saida eh “taxi cab”

		x = "library";
		System.out.println(x + " card"); // a saida eh “library card”

		x = "Atlantic";
		x += " ocean";
		System.out.println(x); // a saida eh “Atlantic ocean”

		x = "Exit";
		System.out.println(x.equalsIgnoreCase("EXIT")); // “true”
		System.out.println(x.equalsIgnoreCase("tixe")); // “false”

		x = "01234567";
		System.out.println(x.length()); // retorna “8”

		x = "oxoxoxox";
		System.out.println(x.replace('x', 'X')); // a saída eh “oXoXoXoX”

		x = "0123456789";
		System.out.println(x.substring(5)); // a saida eh “56789”
		System.out.println(x.substring(5, 8)); // a saida eh “567”

		x = "A New Moon";
		System.out.println(x.toLowerCase()); // a saida eh “a new moon”

		x = "big surprise";
		System.out.println(x.toString());

		x = "A New Moon";
		System.out.println(x.toUpperCase()); // a saida eh "A NEW MOON"

		x = " hi ";
		System.out.println(x + "t" ); // a saída eh " hi t“
        System.out.println(x.trim() + "t"); // a saida eh "hit"
    

	}

}


