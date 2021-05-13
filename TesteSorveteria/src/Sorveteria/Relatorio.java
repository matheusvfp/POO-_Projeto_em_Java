package Sorveteria;

public class Relatorio {
	private Venda v = new Venda();
	
	public void setVenda(Venda v) {
		this.v = v;
	}
	public Venda getVenda() {
		return this.v;
	}
	
	public void relatorio() {
		System.out.println("\n----------Relatório-------------\n");
		v.exibe();
	}
}
