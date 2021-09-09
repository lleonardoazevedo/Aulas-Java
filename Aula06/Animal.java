package herancaPolimorfismo;
/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos
*(observe a tabela), utilize os seus conhecimentos e distribua as características de forma que tudo
*o que for comum a todos os animais fique na classe Animal: 
*/

public class Animal {

	private String nome;
	private int idade = 0;
	private String emiteSom;
	private String correr;
	
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
	public String getEmiteSom() {
		return emiteSom;
	}
	public void setEmiteSom(String emiteSom) {
		this.emiteSom = emiteSom;
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
}
