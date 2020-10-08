package lab2;

public class Variaveis6 {
    public static void main(String[] args) {      // OPERADORES - ATRUIBUICAO COMPOSTA
    
    int Valor1 = 150;  //cria uma variavel int e atribuo um valor a ela

    Valor1 -= 25;      //retiroa '25' inteiro do '150'
    System.out.println(Valor1);    // 125

    int calculo = 28000;
    System.out.println(calculo);

    Valor1 = 35;   //atribuo outro valor a essa variavel e declaro outra variavel inteira com um determinado valor na linha posterior
    int Valor2 = 400;

    calculo /= Valor1 * Valor2; // 35 * 400 = 14000 -> 28000 / 14000 = 2
    System.out.println(calculo);   //da print no resultado do calculo da linha anterior

 } 
}