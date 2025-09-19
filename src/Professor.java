public class Professor extends Usuario {
    private Integer maxLivrosEmprestados = 3;

    public Professor(String nome) {
        super(nome);
    }

    public boolean podePegarEmprestado() {
        if(this.livrosEmprestados.size() < maxLivrosEmprestados) {
            return true;
        }
        return false;
    }
}
