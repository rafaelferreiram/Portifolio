package br.com.webloja;

public class Produto {
	
	private long id;
	private String nome;
	private String tipo;
	private double preco;
	public long getId() {
		return id;
	}
	public void setId(long codigo) {
		this.id = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
