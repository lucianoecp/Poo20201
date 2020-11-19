public class Voo {

	// outros membros removidos para clareza

	int poltronas = 150, passageiros;
	int totalBagagensVerificadas;
	int maximoBagagensDeMao = poltronas * 2, totalBagagensDeMao;

	// v7
	private int numeroVoo;
	private char classeVoo;

	int getPoltronas() { return 150; }

	int getPassageiros() { return passageiros; }

	public Voo() {}

	public Voo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}

	public Voo(char classeVoo) {
		this.classeVoo = classeVoo;
	}	

	public void adicionar1Passageiro() {
		if (verificarPoltronaDisponivel())
			passageiros += 1;
		else {
			//tratarLotado();
		}	
	}

	public void adicionar1Passageiro(int bagagens) {
		if (verificarPoltronaDisponivel()) {
			adicionar1Passageiro();
			totalBagagensVerificadas += bagagens;
		}
	}

	public void adicionar1Passageiro(Passageiro p) {
		adicionar1Passageiro(p.getBagagensVerificadas());
	}

	public void adicionar1Passageiro(int bagagens, int bagagensDeMao) {
		if (verificarPoltronaDisponivel() && verificarEspacoNoBagageiro(bagagensDeMao)) {
			//adicionar1Passageiro(bagagens());
			totalBagagensDeMao += bagagensDeMao;
		}
	}

	public void adicionar1Passageiro(Passageiro p, int bagagensDeMao) {
		adicionar1Passageiro(p.getBagagensVerificadas(), bagagensDeMao);
	}

	public boolean verificarPoltronaDisponivel() {
		return passageiros < poltronas;
		//return passageiros < getPoltronas();
	}
	
	public boolean verificarEspacoNoBagageiro(int bagagensDeMao) {
		return totalBagagensDeMao + bagagensDeMao <=  maximoBagagensDeMao;
	}

	@Override
	public boolean equals(Object o) {
		//if (equals(o))
		if (super.equals(o))
			return true;

		if (!(o instanceof Voo))
			return false;

		Voo outro = (Voo) o;
		
		return
			numeroVoo == outro.numeroVoo &&
			classeVoo == outro.classeVoo;
	}

	public static void main() {

		Voo v = new Voo();
		
		Passageiro p1 = new Passageiro(0, 1);
		Passageiro p2 = new Passageiro(0, 2);
		
		v.adicionar1Passageiro();
		v.adicionar1Passageiro(2);
		v.adicionar1Passageiro(p1);

		short tresMalas= 3;

		v.adicionar1Passageiro(tresMalas, 2);
		v.adicionar1Passageiro(p2, 1);

		/*// v9
		Voo v175 = new Voo(175);
		VooCarga vc = new VooCarga();
		VooCarga vc294 = new VooCarga(294); // problema
		VooCarga vc85 = new VooCarga(85, 2000.0);
		VooCarga vcGrande = new VooCarga(5000.0);
        */
	}

}
