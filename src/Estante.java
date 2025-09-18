import java.util.ArrayList;
import java.util.List;

public class Estante {

    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        if(this.livros.remove(livro)) {
            System.out.println("Livro removido");
        }


    }

    public Object buscarLivroPorTitulo(String titulo) {
        for (Livro livroAtual : this.livros) {
            if(livroAtual.getNome().equalsIgnoreCase(titulo)){
                System.out.println("Livro Encontrado!" + livroAtual);

            }
        }
        return null;
    }

    public Livro mostrarLivrosdisponiveis() {
        for(Livro livroatual : this.livros) {
            if(livroatual.estaDisponivel()) {
                System.out.println(livroatual);
            }

        } return null;
    }
}
