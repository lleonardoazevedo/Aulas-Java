package br.com.generation.polimorfismo;
//leonardo azevedo
//2 - Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior 
//e invoque o método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.

public abstract class implemets InterfaceAnimal {

		private String nome;
		private int idade = 0;			
		private String correr;
		
		
		
		public implemets getInterfaceAnimal() {
			return InterfaceAnimal;
		}

		public void setInterfaceAnimal(implemets interfaceAnimal) {
			InterfaceAnimal = interfaceAnimal;
		}

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getCorrer() {
			return correr;
		}
		public void setCorrer(String correr) {
			this.correr = correr;
		}
		public void emitirSom() {
			// TODO Auto-generated method stub
			
		}
		
	}
