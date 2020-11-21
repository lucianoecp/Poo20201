public class PilotoCarga extends Piloto {

	@Override
	public boolean aceitar(Voo v) {
		return v.getPassageiros() == 0;
	}

}
