package edu.poo;

public class OperadoresLogicos2 {
    public static void main(String[] args) {
		// operador logico e vs operador logico condicional e
		int alunos = 150;
		int salas = 0;

		//if (salas > 0 & alunos/salas > 30)
		if (salas > 1 && alunos/salas > 30) 
			System.out.println("lotada!");
		
		System.out.println();
		System.out.println("*** fim programa ***");			
	}
}
