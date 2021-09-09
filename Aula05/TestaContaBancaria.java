package br.com.generation;

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria CB = new ContaBancaria();
		
		CB.setNome("Leonardo");
		CB.setConta("234.567.890.232");
		CB.setValor("R$ 1000,00");
		
		System.out.println("O cliente " + CB.getNome() + "\nPossui o numero de conta: "
		+ CB.getConta());
		System.out.println("Valor em caixa do cliente: " + CB.getValor());

	}

}
