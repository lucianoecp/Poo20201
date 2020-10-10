package poo.aula3;

public class Variaveis6 {
    //Operadores de atribuição composta:
    public static void main(String[] args) {

            int valor =1000;
            valor -= 223;
            System.out.println(valor); // 1000 - 223 = 777
    

            double nota1 = 9.75;
            double nota2 = 7.75;
            double nota3 = 3.5;
            int qtNotas = 3;

            double media = nota1 + nota2 + nota3;
            System.out.println(media);

            media /= qtNotas;

            System.out.println(media); // 21.0/3 = 7.0
        
    }
    
}
