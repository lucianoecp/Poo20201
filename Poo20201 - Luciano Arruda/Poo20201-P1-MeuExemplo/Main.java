class Main {
  public static void main(String[] args) {
    Automovel automovel = new Automovel();

    automovel.imprimeDados(); // 0; 0; null;

    // mesma coisa de imprimeDados(), mas definido como privado
    // automovel.imprimeDadosPrivados(); // ERRO!
    // automovel.capacidade = 20000; // ERRO!
    // autompovel.numRodas = 4; // ERRO!

  }
}