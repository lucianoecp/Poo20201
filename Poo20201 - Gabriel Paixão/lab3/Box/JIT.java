import java.util.*;

public class JIT {

	void takesAnArray(int[] someArray) {
		// usa o parametro array
	}

	public static void main(String[] args) {
		JIT j = new JIT();		
		j.takesAnArray(new int[] { 7, 7, 8, 2, 5 }); // passa um array
       
        ArrayList<String> c = new ArrayList<String>(); // cria um ArrayList, c
		c.add("Oslo"); // adiciona cidades originais
		c.add("Paris");
		c.add("Rome");

		int index = c.indexOf("Paris"); // localiza o indice de paris

		System.out.println(c + " " + index);

		c.add(index, "London"); // adiciona londres antes de paris
		System.out.println(c); // exibe o conteudo de c
    }

}

