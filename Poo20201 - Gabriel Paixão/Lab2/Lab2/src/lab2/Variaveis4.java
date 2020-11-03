package lab2;

public class Variaveis4 {
    public static void main(String[] args)
    {
        int valor1 = 10; // declaro um valor
        int valor2 = valor1; // declaro uma variavel recebendo "valor1"
        
        valor1 = 20; // altero o valor1
        
        System.out.println(String.format("%s, %s", valor1, valor2)); 

    }
}
