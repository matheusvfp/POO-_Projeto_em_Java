package Sorveteria;

public class Usuario {
	private String nome;
	private String login;
	private String senha;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getLogin() {
		return this.login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenha() {
		return this.senha;
	}
	
	public void exibe(Usuario u) {
		System.out.println("Nome: "+u.getNome());
		System.out.println("Login: "+u.getLogin());
		System.out.println("Senha: "+u.getSenha());
	}
	
}
