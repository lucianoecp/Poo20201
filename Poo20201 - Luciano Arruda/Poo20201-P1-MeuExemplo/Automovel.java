public class Automovel extends Terrestre {
  private String cor;
  private int numPortas;
  private String placa;

  public void imprimeDados()
  {
    System.out.println("Capacidade: "+capacidade);
    System.out.println("Número de rodas: "+numRodas);
    System.out.println("Cor: "+cor);
  }

  private void imprimeDadosPrivados()
  {
    System.out.println("Capacidade: "+capacidade);
    System.out.println("Número de rodas: "+numRodas);
    System.out.println("Cor: "+cor);
  }
}