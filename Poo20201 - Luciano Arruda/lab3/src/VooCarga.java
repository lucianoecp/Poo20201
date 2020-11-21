public class VooCarga extends Voo {

	double espacoCargaMaximo = 1000.0;
	double espacoCargaUsado;

	int poltronas = 12;
	
	int getPoltronas() { return 12; }

	public VooCarga() {
	}

	public VooCarga(int numeroVoo) {
		super(numeroVoo);
	}

	public VooCarga(int numeroVoo, double espacoCargaMaximo) {
		//super(numeroVoo);
		this(numeroVoo);
		this.espacoCargaMaximo = espacoCargaMaximo;
	}

	public VooCarga(double espacoCargaMaximo) {
		this.espacoCargaMaximo = espacoCargaMaximo;
	}		

	//public void adicionar1Pacote(double altura, double largura, double profundidade) {
	public final void adicionar1Pacote(double altura, double largura, double profundidade) {
		
		double tamanho = altura * largura * profundidade;
		
		if (verificarPossuiEspaco(tamanho))
			espacoCargaUsado += tamanho;
		else
			tratarSemEspaco();
	}

	private boolean verificarPossuiEspaco(double tamanho) {
		return espacoCargaUsado + tamanho <= espacoCargaMaximo;
	}

	private void tratarSemEspaco() {
		System.out.println("espaco insuficiente");
	}

	public static void main(String[] args) {
		/*
		VooCarga vc = new VooCarga();
		vc.adicionar1Pacote(1.0, 2.5, 3.0);

		Passageiro joao = new Passageiro(0, 2);
		vc.adicionar1Passageiro(joao);
		
		// v2
		VooCarga v = new VooCarga();
		Passageiro maria = new Passageiro(0, 2);
		v.adicionar1Passageiro(maria);
		//v.adicionar1Pacote(1.0, 2.5, 1.5);
		
		// v3
		Voo[] esquadrao = new Voo[5];
		esquadrao[0] = new Voo();
		esquadrao[1] = new VooCarga();
		esquadrao[2] = new VooCarga();
		esquadrao[3] = new Voo();
		esquadrao[4] = new VooCarga();
		
		
		// v4
		Voo v1 = new Voo();
		System.out.println(v1.poltronas); // 150
		
		VooCarga vc = new VooCarga();
		System.out.println(vc.poltronas); // 12

		Voo v2 = new VooCarga();
		System.out.println(v2.poltronas); // 150
        

		v2.adicionar1Passageiro();
        vc.adicionar1Passageiro();
        
		
		// v5
		Voo v1 = new Voo();
		System.out.println(v1.getPoltronas()); // 150
		
		VooCarga vc= new VooCarga();
		System.out.println(vc.getPoltronas()); // 12
		
		Voo v2 = new VooCarga();
		System.out.println(v2.getPoltronas()); // 12
		
		v2.adicionar1Passageiro();
        vc.adicionar1Passageiro();
       
		
		// v6
		//Object[] coisa= new Object[3];
		//coisa[0] = new Voo();
		//coisa[1] = new Passageiro(0, 2);
		//coisa[2] = new VooCarga();

		//Object o = new Passageiro();
		//o = new Voo[5];
		//o = new VooCarga();
		////o.adicionar1Pacote(1.0, 2.5, 3.0);

		//if (o instanceof VooCarga) {
		//	//VooCarga vc = o;
		//	VooCarga vc = (VooCarga) o;
		//	vc.adicionar1Pacote(1.0, 2.5, 3.0);
		//
		//	System.out.println(o instanceof VooCarga);
		//}
        */
		// v7
		//Voo v1 = new Voo(175);
		//Voo v2 = new Voo(175);

		// falso
		//if (v1 == v2) {
		//	// todo
		//}
			
		// falso ou verdadeiro
		//if (v1.equals(v2)) {
		//	// todo
		//}

		//Passageiro p = new Passageiro();
		
		// falso
		//if (v1.equals(p)) {
		//	// todo
		//}
        /**/
		 //v8
		Voo v1 = new Voo(175);
		Voo v2 = v1;

		// falso
		if (v1 == v2) {
			// todo
		}
			
		// falso ou verdadeiro
		if (v1.equals(v2)) {
			// todo
		}

		Passageiro p = new Passageiro();
		
		// falso
		if (v1.equals(p)) {
			// todo
		}
		

	}

}
