package br.com.generation;

import java.util.Scanner;

//5 - Crie um programa que leia um número do teclado até que encontre um número igual a zero.
//No final, mostre a soma dos números digitados.(DO...WHILE)

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
		         System.out.println("A soma de todos os numeros é: " + soma); 
		         soma = leia.nextInt();
	 
		         leia.close();
	 }
         
}
