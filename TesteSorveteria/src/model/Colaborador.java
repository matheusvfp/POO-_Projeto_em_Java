
package model;

public class Colaborador {
    private int id;
    private String nome;
    private String email;
    private String celular;
    private String login;
    private String senha;

    public Colaborador(int id, String nome, String email, String celular, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.login = login;
        this.senha = senha;
    }

    public Colaborador(String nome, String email, String celular, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.login = login;
        this.senha = senha;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
