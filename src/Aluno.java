public class Aluno extends Usuario {
    private Integer maxLivrosEmprestados = 1;

    public Aluno(String nome) {

    }

    public boolean podePegarEmprestado() {
        if( this.livrosEmprestados.size() <  maxLivrosEmprestados) {
            return true;
        }
        return false;
    }
}
