package br.com.generation;

public class TestaAviao {

	public static void main(String[] args) {
	
		Exercicio1Aviao aviao = new Exercicio1Aviao();
		
	    aviao.setNomePiloto("Leonardo");
	    aviao.setDecola("decola na cidade");
	    aviao.setVoa("voa");
        
        System.out.println("O piloto " + aviao.getNomePiloto() + " " + aviao.getDecola() + " e "
        + aviao.getVoa() + " pela cidade do mexico!" );
	        
	}

}
