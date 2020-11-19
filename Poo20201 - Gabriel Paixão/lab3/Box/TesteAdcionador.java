

// From another class, invoke the addThem() method
public class TesteAdcionador{ 
	public static void main(String[] args){
		Adicionador a = new Adicionador();
		int b = 27;
		int c = 3;
		 // Which addThem is invoked?
		int result = a.Adcionar(b,c); 
		 // Which addThem?
		double doubleResult = a.Adcionar(22.5,9.3); 
	}
}