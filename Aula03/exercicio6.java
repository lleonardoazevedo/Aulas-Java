package br.com.generation;
//leonardo azevedo
//6 - Escrever um programa que receba vários números inteiros no teclado. 
//E no final imprimir a média dos números múltiplos de 3. 
//Para sair digitar 0(zero).(DO...WHILE)

import java.util.Scanner;

public class exercicio6 {
        public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        	
        int numero = 0,soma = 0,contador = 0;
        
        System.out.println("Para saber o numero multiplo de 3 ");
        System.out.println("Digite um numero: ");
        numero = leia.nextInt();
        
        do { //enquanto
        	System.out.println("Digite um numero: ");
            numero = leia.nextInt();
            
            if(numero % 3==0) { //aqui ele ta guardando o numero
            	soma = soma + numero;
            	contador++;
            }
         }
        while (numero != 0);
        System.out.println("a media dos multiplos de 3: " + (soma / contador));
        numero = leia.nextInt();
       
        leia.close();
}
}