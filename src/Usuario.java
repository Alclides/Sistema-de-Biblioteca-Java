import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    protected String nome;
    protected List<Livro> livrosEmprestados = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public Usuario() {
    }

    abstract boolean podePegarEmprestado();


    public void adicionarLivroEmprestado(Livro livro) {
        if(podePegarEmprestado()) {
            livrosEmprestados.add(livro);
        }
        else{
            System.out.println("O usuario näo pode pegar mais Livros!");
        }
    }

    public List<Livro> getLivrosEmprestados() {
        return this.livrosEmprestados;
    }

    public void removerLivroEmprestado(Livro livro) {
        if(livrosEmprestados.remove(livro)) {
            System.out.println("Livro removido!");
        }
        else{
            System.out.println("Livro invalido!");
        }
    }
}
