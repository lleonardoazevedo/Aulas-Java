package br.com.generation;

public class cliente {
//1) Crie uma classe cliente e apresente os atributos e m?todos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informa??es deste objeto no console
		
//atributos --> variaveis. montando um cliente
		
		private String nome;
		private String cpf;
		private String email;
		private String endere?o;
		private int idade;
		
		public String getNome() {
			return nome; 
		}
		public void setNome(String nome) {
			this.nome = nome; //this informa que vc ta usando o "nome"
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEndere?o() {
			return endere?o;
		}
		public void setEndere?o(String endere?o) {
			this.endere?o = endere?o;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
	}
