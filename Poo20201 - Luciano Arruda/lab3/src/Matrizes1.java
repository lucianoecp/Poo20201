public class Matrizes1 {

  public static void main(String[] args) {
    // Definindo os Arrays
    String equipe[][];
    // Criando os Arrays
    equipe = new String[5][2];

	// Carregando dados no Array
	equipe[0][0] = "Luciano";
	equipe[0][1] = "Arruda";
	equipe[1][0] = "Kevin";
	equipe[1][1] = "Kasantaroeno";
	equipe[2][0] = "Gustavo";
	equipe[2][1] = "Silveira";
	equipe[3][0] = "Chrystian";
	equipe[3][1] = "Pacheco";
	equipe[4][0] = "Igor";
	equipe[4][1] = "Ximenes";

	for(int lin=0; lin<5; lin++)
	{
		System.out.print("Membro "+(lin+1)+": ");

		for(int col = 0; col<2; col++)
		{
			System.out.print(" "+equipe[lin][col]);
		}
		System.out.println("");
	}



  }
}
