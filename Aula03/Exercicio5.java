package br.com.generation;

import java.util.Scanner;

//5 - Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
//No final, mostre a soma dos n�meros digitados.(DO...WHILE)

public class Exercicio5 {
	 public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 
		 int numero, soma = 0;
		 
		 do { //enquanto
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			soma = soma + numero;
		 }
		 
		  while (numero != 0);
		         System.out.println("A soma de todos os numeros �: " + soma); 
		         soma = leia.nextInt();
	 
		         leia.close();
	 }
         
}
