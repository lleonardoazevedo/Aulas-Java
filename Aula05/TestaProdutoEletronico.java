package br.com.generation;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		ProdutoEletronico celular = new ProdutoEletronico();
		
		celular.setMarca("Apple");
	    celular.setNome("Iphone");
		
		System.out.println("O produto " + celular.getNome() + " custa 3000,00 e é feito pela marca " + celular.getMarca() );
        
	}

}
