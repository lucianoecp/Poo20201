package lab2;

public class Variaveis8 {
    public static void main(String[] args) {
    
    float valorFloat = 1.0f;      //DECLARO UM VALOR FLOAT
    double valorDouble = 4.0d;    //DECLARO UM VALOR DOUBLE
    byte valorByte = 7;           //DECLARO UM VALOR BYTE
    short valorShort = 7;         //DECLARO UM VALOR SHORT
    long valorLong = 5;           //DECLARO UM VALOR LONG

    
    short resultado1 = (short) valorByte;    //PASSO O VALOR EM BYTE PARA SHORT

    short resultado2 = (short) (valorByte - valorLong);    //PASSO O RESULTADO DO VALOR EM BYTE MENOS O VALOR EM LONG PARA SHORT

    double resultado3 = valorLong - valorDouble;         //PASSO O RESULTADO DO VALOR EM LONG MENOS O VALOR EM DOUBLE PARA DOUBLE

    long resultado4 = (long) (valorShort - valorLong + valorFloat + valorDouble);    
    //PASSA O RESULTADO DO CALCULO DE VALORES VARIADOS DECLARADOS EM LONG AO PASSO QUE DECLARA A VARIAVEL TIPO LONG 'resultado4'

    System.out.println("SEM ERROS");
 }
}