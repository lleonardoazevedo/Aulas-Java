package br.com.generation;

import java.util.Scanner;

public class Exercicio2 {
// leonardo azevedo
//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	public static void main(String[] args) {
		int cont,num, impar =0, par = 0;
		Scanner leia = new Scanner(System.in);
		//Random numero = new Random(); crtl shift o
		
		for (cont = 0;cont <= 9; cont++) {
			System.out.println("Digite os 10 numeros: ");	//colocar dentro do for
			num = leia.nextInt();
			
//if (cont==10) { 
//num = leia.nextInt();
	    
	    	if (num % 2 ==0) { //se resto da divis�o sobrar 2 � par
	    	    par++;
		    }
	    	else {
	            impar++; // senao � impar.    
		    }		
//}
		   }
		   System.out.println(par + " S�o pares\n " +impar + " S�o impares \n");
               leia.close();
	}
}
