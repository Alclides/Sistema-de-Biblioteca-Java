public class Livro {
    private String nome;
    private String autor;
    private Boolean estaDisponivel = false;


    //construtor
    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    public Livro (){

    }

    public void marcarEmprestado() {
        this.estaDisponivel = false;
    }

    public void marcarDisponivel() {
        this.estaDisponivel = true;
    }

    public boolean estaDisponivel()
    {
        return this.estaDisponivel;
    }

    public String getNome() {
        return this.nome;
    }

    public String getAutor() {
        return this.autor;
    }

    @Override
    public String toString() {
        return "Nome do Livro : " + this.nome + ", Author é: " + this.autor;
    }
}
