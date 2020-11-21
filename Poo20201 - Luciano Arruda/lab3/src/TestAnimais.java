public class TestAnimais {
	public static void main (String [] args) {
		Animal a = new Animal();
		Animal b = new Cavalo(); // Animal ref, but a Horse object
		a.comer(); // Runs the Animal version of eat()
		b.comer(); // Runs the Horse version of eat()
	}
}