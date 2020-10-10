package poo.aula3;

public class Variaveis7 {
    // Precedência de operadores:

    public static void main(String[] args) 
    {

        int val1 = 12;
        int val2 = 4;
        int val3 = 7;
        int val4 = 1;

        int resultado1 = val1 - val2 /  val3;
        System.out.println(resultado1); // 12

        int resultado2 = (val1 - val2)/ val3;
        System.out.println(resultado2); // 1
        
        int resultado3 = val1 / val3 * val4 + val2;
        System.out.println(resultado3); // 5
        
        int resultado4 = val1 / (val3 * (val4 + val2)); 
        System.out.println(resultado4); // 0

        int resultado5 = val4 + -- val3 * val2++;
        System.out.println(resultado5); // 25

        
    }
    
}
