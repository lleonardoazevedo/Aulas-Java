package br.com.generation;

import java.util.Scanner;
//leonardo azevedo
//4 - Fa�a um programa em que permita a entrada de um n�mero qualquer
// exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo;
//se for �mpar exiba o n�mero elevado ao quadrado.

public class Exercicio2 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int numero;
	double raiz, elevado = 0;
	
	System.out.println("Digite um numero inteiro: ");
	numero = leia.nextInt();
	elevado = Math.pow(numero, elevado);
	
	if(numero % 2 ==0) {; // se o resto da divisao for igual a 0 � par
	   System.out.println("este numero � par...");
	   raiz = Math.sqrt(numero);
	   
	   System.out.println("Raiz Quadrada:" + raiz);
	   System.out.println("Raiz Quadrada:" + Math.sqrt(numero));
	}
	else if (numero % 2==1) { //se o resto da divisao for igual a 1 � impar
		System.out.println("este numero � impar...");
		elevado = Math.pow(numero, 2);
		
		System.out.println("potencia:  + elevado");
		
		leia.close();
	}
	}
}
