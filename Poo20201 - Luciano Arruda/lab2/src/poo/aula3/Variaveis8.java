package poo.aula3;

public class Variaveis8 {

  public static void main(String[] args) {
    // conversao de tipo
    //int valorInt = 50;
    //long valorLong= valorInt;
    //valorLong = 50;
    //valorInt = (int) valorLong;
    float valorFloat = 5.0f;
    double valorDouble = 2.0d;
    byte valorByte = 7;
    short valorShort = 7;
    long valorLong = 7;
    //short resultado1 = valorByte;
    //short resultado1 = valorLong;
    //short resultado1 = (short) valorLong;
    short resultado1 = (short) valorByte;
    //short resultado2 = valorByte - valorLong;
    short resultado2 = (short) (valorByte - valorLong);
    //long resultado3 = valorLong - valorFloat;
    //float resultado3 = valorLong - valorFloat;
    //float resultado3 = valorLong - valorDouble;
    double resultado3 = valorLong - valorDouble;
    //long resultado4 = valorShort - valorLong + valorFloat;
    //long resultado4 = valorShort - valorLong + valorFloat + valorDouble;
    long resultado4 = (long) (
      valorShort - valorLong + valorFloat + valorDouble
    );
    System.out.println("sucesso!");
  }
}
