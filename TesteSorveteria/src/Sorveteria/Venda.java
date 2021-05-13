package Sorveteria;

public class Venda {

	private Produto p = new Produto();
	private String data;
	private String colaborador;
	private float valorTotal;
	
	public void setProduto(Produto p) {
		this.p = p;
	}
	public Produto getProduto() {
		return this.p;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return this.data;
	}
	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}
	public String getColaborador() {
		return this.colaborador;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public float getValorTotal() {
		return this.valorTotal;
	}
	
	public void exibe() {
		this.p.exibe();
		System.out.println("data: "+this.data);
		System.out.println("colaborador: "+this.colaborador);
		System.out.println("valorTotal: "+this.valorTotal);
	}
}
