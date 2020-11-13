class Main {
  public static void main(String[] args) {
    Automovel automovel = new Automovel();

    automovel.imprimeDados(); // 0; 0; null;

    // mesma coisa de imprimeDados(), mas definido como privado
    // automovel.imprimeDadosPrivados(); // ERRO!
   
    automovel.capacidade = 20000; 
    System.out.println("\n\nCapacidade "+automovel.capacidade);
    
    automovel.numRodas = 4;
    System.out.println("Número de rodas "+automovel.numRodas);
    
    //automovel.numPortas=4; //ERRO
    //System.out.println("Número de portas "+automovel.numRodas);

  }
}
