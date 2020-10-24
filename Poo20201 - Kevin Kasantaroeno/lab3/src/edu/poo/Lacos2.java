package edu.poo;

public class Lacos2 {
    public static void main(String[] args) {
		// laco for-each
		float[] valores = { 10.0f, 20.0f, 15.0f };
		float soma = 0.0f;
		
		for(float valorAtual : valores) {
			soma += valorAtual;
			System.out.println(soma);
		}
	}
}
