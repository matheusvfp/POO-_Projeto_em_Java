
package model;

public class Colaborador {
    private int id;
    private String cpf;
    private String email;
    private String celular;

    public Colaborador(int id, String cpf, String email, String celular) {
        this.id = id;
        this.email = cpf;
        this.email = email;
        this.celular = celular;
    }

    public Colaborador(String cpf, String email, String celular) {
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
