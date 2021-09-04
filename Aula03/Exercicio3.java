package br.com.generation;

import java.util.Scanner;

public class Exercicio3 {
// leonardo azevedo
//3 - Solicitar a idade de várias pessoas e imprimir:
// Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
// O programa termina quando idade for =-99. (WHILE)

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	int idade = 0, menorQue21 = 0, maiorQue50 = 0;
	System.out.println("Digite -99 para encerrar o programa!");
	
	do {
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		if(idade<21 && idade > 0)
			menorQue21++;
		if(idade>50 && idade > 0)
			maiorQue50++;
	}while(idade != -99);
	
	leia.close();
	System.out.println("Existem " + menorQue21 + " pessoas menores que 21 anos de idade e " 
	+ maiorQue50 +" pessoas maiores que 50 anos de idade");
}
}