package br.com.generation;
//leonardo azevedo
//6 - Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe,
//em seguida crie um objeto conta bancaria, defina as instancias deste objeto 
//e apresente as informações deste objeto no console.

public class ContaBancaria {

	private String nome;
	private String conta;
	private String valor;
	
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
}
