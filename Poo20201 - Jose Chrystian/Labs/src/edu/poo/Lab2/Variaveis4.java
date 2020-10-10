public class Variaveis4 {
  public static void main(String[] args) {
    // tipos primitivos sao armazenados por valor
    int firstValue= 100;
    int secondValue= firstValue;
    firstValue= 50;
    System.out.println(String.format("%s, %s", firstValue, secondValue));
}
}