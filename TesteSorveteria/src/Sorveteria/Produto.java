package Sorveteria;

public class Produto {
	private int codigo;
	private String categoria;
	private String nome;
	private float preco;
	private String dataValidade;
	private int quantidade;
	private String marca;
	private int ml;
	private float peso;
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo() {
		return this.codigo;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCategoria() {
		return this.categoria;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getPreco() {
		return this.preco;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public String getDataValidade() {
		return this.dataValidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setMl(int ml) {
		this.ml = ml;
	}
	public int getMl() {
		return this.ml;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getPeso() {
		return this.peso;
	}
	
	public void exibe() {
		System.out.println("codigo: "+this.codigo);
		System.out.println("categoria: "+this.categoria);
		System.out.println("nome: "+this.nome);
		System.out.println("preco: "+this.preco);
		System.out.println("dataValidade: "+this.dataValidade);
		System.out.println("quantidade: "+this.quantidade);
		System.out.println("marca: "+this.marca);
		System.out.println("ml: "+this.ml);
		System.out.println("peso: "+this.peso);
	}
}
