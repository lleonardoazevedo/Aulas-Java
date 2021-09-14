package br.com.generation.collections;

public class Collections {
 
		private String nomeProduto = "";
		private double preco = 0.0;
		
		public Collections(String nomeProduto, double preco) {
			this.nomeProduto = nomeProduto;
			this.preco = preco;
		}

		public String getNomeProduto() {
			return nomeProduto;
		}

		public void setNomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}
		
	}
