package lab2;

public class Variaveis7 {
    public static void main(String[] args)
    {
        int v1 = 1;
        int v2 = 2;  // declaro 4 variaveis com valores distintos
        int v3 = 5;
        int v4 = 10;
        
        int resultado1 = v2 * v3;  // operaçoes com as variaveis
        int resultado2 = v4 - v1; 

        System.out.println(resultado1); // 10
        System.out.println(resultado2); // 9

        int resultado3 = (v2 * v4 / v3) * v1 + v2; // outra operaçao

        System.out.println(resultado3); // 6

        int resultado4 = ++v1 * v4 / v2-- * v3; // operaçao com ordem de resoluçao
        
        System.out.println(resultado4); // 50

    }
}
