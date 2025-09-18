import java.util.ArrayList;
import java.util.List;

public class Estante {

    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
        System.out.println(livros);
    }

    public void removerLivro(Livro livro) {
        if(this.livros.remove(livro)) {
            System.out.println("Livro removido");
            System.out.println(livros);
        }


    }
}
