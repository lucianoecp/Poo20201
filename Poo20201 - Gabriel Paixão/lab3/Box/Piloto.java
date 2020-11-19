public abstract class Piloto {
	
        private Voo vooAtual;
    
        public void voar(Voo v) {
            if (aceitar(v))
                vooAtual = v;
            else
                tratarAceitacao();
        }
    
        public abstract boolean aceitar(Voo v);
    
        private void tratarAceitacao() {
            System.out.println("nao pode aceitar");
        }
}