package edu.poo;

public class InstrucoesIfAninhadas1 {
    public static void main(String[] args) {
        // instrucoes if aninhadas
        float alunos = 0.0f;
        float salas = 4.0f;

        if (alunos > 0.0f) {
            if (salas > 4.0f)
                System.out.println(alunos/salas);
        } else
            System.out.println("sem alunos");

        System.out.println();
        System.out.println("*** fim programa ***");
    }
}
