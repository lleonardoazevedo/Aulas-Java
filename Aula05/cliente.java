package br.com.generation;

public class cliente {
//1) Crie uma classe cliente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informações deste objeto no console
		
//atributos --> variaveis. montando um cliente
		
		private String nome;
		private String cpf;
		private String email;
		private String endereço;
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
		public String getEndereço() {
			return endereço;
		}
		public void setEndereço(String endereço) {
			this.endereço = endereço;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
	}
