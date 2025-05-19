package entities;

import java.util.Date;

public class Usuario {
    private String nome;
    private String email;
    private Date dataNascimento;
    private String matricula;
    
    public Usuario(String nome, String email, Date dataNascimento, String matricula) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "| E-mail: " + email + "| Data de nascimento: " + dataNascimento + "| Matrícula: "
                + matricula;
    }

    
}
