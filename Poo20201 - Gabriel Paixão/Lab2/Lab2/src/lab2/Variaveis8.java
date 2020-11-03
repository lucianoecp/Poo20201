package lab2;

public class Variaveis8 {
    public static void main(String[] args)
    {
        float valorFloat = 1.0f;      // valor em float
        double valorDouble = 4.0d;    // valor em double
        byte valorByte = 7;           // valor em byte
        short valorShort = 7;         // valor em short
        long valorLong = 5;           // valor em long

        short resultado1 = (short) valorByte; // converte byte em short
        
        short resultado2 = (short) (valorByte - valorLong); // converte a subtraçao de byte e long em short

        double resultado3 = valorLong - valorDouble; // subtrai long e double em uma variavel double

        long resultado4 = (long)(valorShort - valorLong + valorFloat + valorDouble); // converte toda a equaçao em long

        System.out.println("OK!!"); // sem erro 
    }
}
