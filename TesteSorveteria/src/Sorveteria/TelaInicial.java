package Sorveteria;

public class TelaInicial {

	public static void main(String[] args) {
		Administrador adm = new Administrador();
		adm.setCnpj(1223443499);
		adm.setNomeAdm("Paulo");
		adm.setLoginAdm("admin");
		adm.setSenhaAdm("11111");
		System.out.println("\n -------------INFO ADMINISTRADOR--------------\n");
		adm.exibe();
		
		Colaborador c = new Colaborador();
		c.setNomeColaborador("Maria");
		c.setEmailColaborador("maria@gmail.com");
		c.setCelularColaborador("(84) 99999-3333");
		c.setLoginColaborador("colmaria");
		c.setSenhaColaborador("22222");
		System.out.println("\n -------------INFO COLABORADOR--------------\n");
		c.exibe(c);
		
		Produto p = new Produto();
		p.setCategoria("Sorvete");
		p.setCodigo(2);
		p.setNome("Sorvete de Chocolate");
		p.setMarca("Kibon");
		p.setPreco((float) 3.4);
		System.out.println("\n -------------INFO PRODUTO--------------\n");
		p.exibe();
		
		System.out.println("\n----------------------INFO VENDA-------------------------\n");
		Venda v = new Venda();
		v.setProduto(p);
		v.setColaborador(c.getNomeColaborador());
		v.setData("13/05/2021");
		v.setValorTotal(p.getPreco());
		v.exibe();
		
		Relatorio r = new Relatorio();
		r.setVenda(v);
		r.relatorio();
	}

}
