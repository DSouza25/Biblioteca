package entities;

public class Livro {
    private String titulo;
    private Integer anoPublicacao;
    private String autor;
    private String matricula;

    public Livro(String titulo, Integer anoPublicacao, String autor, String matricula) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.matricula = matricula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "| Ano de publicação: " + anoPublicacao + "| Autor: " + autor + "| Matrícula: "
                + matricula;
    }
    
    
}
