package edu.poo;

public class Switch1 {
    public static void main(String[] args) {
		// instrucao switch
		int valor = 10;
		//int valor = 20;
		//int valor = 25;

		switch(valor % 2) {
			case 0:
				System.out.print(valor);
				System.out.println(" eh par ");
				break;
			case 1:
				System.out.print(valor);
				System.out.println(" eh impar ");
				break;
			default:
				System.out.println("oops esta quebrado");
				break;
		}
	}
}
