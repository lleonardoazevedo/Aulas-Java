package br.com.generation;
//leonardo azevedo
//4 - Crie uma classe funcionario eletronico e apresente os atributos e m�todos referentes esta classe,
//em seguida crie um objeto funcion�rio, defina as instancias deste objeto
//e apresente as informa��es deste objeto no console.
public class funcionario {
       
	 private String nome;
	 private String empresa;
	 private String salario;
	 
	 public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	
}
