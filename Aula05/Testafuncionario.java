package br.com.generation;

import java.util.Scanner;

public class Testafuncionario {
 
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dinheiro = 0;
		
		funcionario fun = new funcionario();
		
		fun.setNome("Leonardo");
		fun.setEmpresa("##Generation Brasil##");
		fun.setSalario("(insira seu salario abaixo) ");
	   
		
		System.out.println("O " + fun.getNome() + " é o novo funcionario da " + fun.getEmpresa());
		System.out.println("Vai receber o salario de R$ " + fun.getSalario()); // usuario vai insirir o salario
		dinheiro = ler.nextInt();
		
		System.out.println("com o salario de " + dinheiro + "R$");
		
	
	ler.close();
}
}