package br.com.generation;

public class TestaCliente {

	public static void main(String[] args) {
		
		cliente cli1 = new cliente();

		cli1.setNome("Leonardo");
		cli1.setCpf("555.808.987-76");
		cli1.setEmail("leonardo@gmail.com");
		cli1.setIdade(26);
		cli1.setEndereço("Rua da Esperança");
		
		System.out.println("Nome do Cliente: " + cli1.getNome());
		System.out.println("Idade do Cliente: " + cli1.getIdade());
		System.out.println("Cpf do Cliente: " + cli1.getCpf());
		System.out.println("Email do Cliente: " + cli1.getEmail());
		System.out.println("Endereço do Cliente: " + cli1.getEndereço());
	}

}

