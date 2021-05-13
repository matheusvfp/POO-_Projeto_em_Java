package Sorveteria;

public class Colaborador {
	private String email;
	private String celular;
	private Usuario u = new Usuario();
	
	public void setEmailColaborador(String email) {
		this.email = email;
	}
	public String getEmailColaborador() {
		return this.email;
	}
	public void setCelularColaborador(String celular) {
		this.celular = celular;
	}
	public String getCelularColaborador() {
		return this.celular;
	}
	public void setNomeColaborador(String nome) {
		this.u.setNome(nome);
	}
	public String getNomeColaborador() {
		return this.u.getNome();
	}
	public void setLoginColaborador(String login) {
		this.u.setLogin(login);
	}
	public String getLoginColaborador() {
		return this.u.getLogin();
	}
	public void setSenhaColaborador(String senha) {
		this.u.setSenha(senha);
	}
	public String getSenhaColaborador() {
		return this.u.getSenha();
	}
	
	public void exibe(Colaborador c) {
		System.out.println("email: "+c.getEmailColaborador());
		System.out.println("celular: "+c.getCelularColaborador());
		this.u.exibe(this.u);
	}
}
