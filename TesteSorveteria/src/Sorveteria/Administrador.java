package Sorveteria;

public class Administrador {
	private long cnpj;
	private Usuario u = new Usuario();
	
	public void setNomeAdm(String nome) {
		this.u.setNome(nome);
	}
	public String getNomeAdm() {
		return this.u.getNome();
	}
	public void setLoginAdm(String login) {
		this.u.setLogin(login);
	}
	public String getLoginAdm() {
		return this.u.getLogin();
	}
	public void setSenhaAdm(String senha) {
		this.u.setSenha(senha);
	}
	public String getSenhaAdm() {
		return this.u.getSenha();
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public long getCpj() {
		return this.cnpj;
	}
	
	public void exibe() {
		System.out.println("CNPJ: "+this.cnpj);
		this.u.exibe(this.u);
	}
}
