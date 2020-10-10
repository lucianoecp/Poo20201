package lab2;

public class Variaveis7 {
    public static void main(String[] args) {     // PRECEDENCIA - OPERADORES

    int valorA = 21, valorB=6, valorC=3, valorD=1;  //DECLARO 4 VALORES INTEIROS
   
    int resultado1 = valorA - valorB / valorC;      //ALGUNS TESTES FEITOS USANDO OS VALORES EM QUESTÃO
    int resultado2 = (valorA - valorB) / valorC;

    System.out.println(resultado1); // 19    //PRINT DOS RESULTADOS
    System.out.println(resultado2); // 5

    int resultado3 = valorA / valorC * valorD + valorB;       //OUTROS TESTES
    int resultado4 = valorA / (valorC * (valorD + valorB));

    System.out.println(resultado3); // 13    //PRINT DA 2 PARTE DOS TESTES
    System.out.println(resultado4); // 1

    int resultado5 = valorD + --valorC * valorB++;      //TESTE 3 MAIS COMPLEXO Q ENVOLVE ORDEM DE RESOLUÇÃO

    System.out.println(resultado5); // 13    //PRINT DA ULTIMA PARTE DE TESTES
    }
 }