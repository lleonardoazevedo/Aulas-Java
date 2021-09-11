package br.com.generation.polimorfismo;

import java.util.Scanner;

public class TestaAnimal {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			Cachorro dog = new Cachorro();
			Cavalo cav = new Cavalo();
			Preguica pre = new Preguica();
			String nome;
		
			//dog.setNome("\nCachorro chama leo");
			//cav.setNome("\nCavalo se chama ariel");
			//pre.setNome("\npreguiça se chama fernanda");

			System.out.println("Escreva o nome do cachorro: ");
			nome = ler.nextLine();
			//dog.setNome(nome);
			
			System.out.println("Agora escreva o nome do cavalo: ");
			nome = ler.nextLine();
			//cav.setNome(nome);
			
			System.out.println("E por ultimo escreva o nome da preguiça: ");
			nome = ler.nextLine();
			//pre.setNome(nome);
			
			//System.out.println("\nOs animais possuem os nomes de "  + dog.getNome() + " | " 
			//+ cav.getNome() + " | " + pre.getNome());
			
			//System.out.println(idade = ler.nextInt());
			
			//System.out.println("\n\nAgora insira a idade do " + dog.getNome()); 
			//dog.setIdade(ler.nextInt());
			
			//System.out.println("\nAgora insira a idade do " + cav.getNome());
			//cav.setIdade(ler.nextInt());
			
			//System.out.println("\nAgora insira a idade da preguiça: " + pre.getNome());
			//pre.setIdade(ler.nextInt());	
				
			//+ "seguida do cavalo e por ultimo da preguiça: " + dog.getNome() + cav.getNome() + pre.getNome());
		   // dog = ler.nextLine();	
			Cavalo.emitirSom();
			Cachorro.emitirSom();
			Preguica.emitirSom();
		
			System.out.println("\nEste cachorro está correndo ");
			
			System.out.println("Este cavalo está correndo ");
			
			System.out.println("Esta preguiça está correndo ");
			
   ler.close();
   }
}
