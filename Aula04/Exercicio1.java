package br.com.generation;
// 1- Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o 

// de uma atividade e o escreva em seguida. 
// Encontre ap�s a maior pontua��o e a apresente. 

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num[] = new int[5]; // vetor de 5 posi��es
	    int i;
		int numMaior = 0;

		for (i = 0; i <= 4; i++) { // ponto e virgula e no ultimo nao precisa. fecha chave.
			num[i] = ler.nextInt();
			System.out.printf("Escreva o valor da " + (i + 1) + "� pontua��o: - ");
			if (num[i] > numMaior) 
				System.out.println("\nO valor maior �" + numMaior);	
		}
		System.out.println("\nO valor maior �" + numMaior);
		 ler.close();	
	}
}
