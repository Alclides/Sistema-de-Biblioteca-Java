import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Livro livro = new Livro("Alclides", "Desconhecido");
    Livro livro2 = new Livro("O homem que abraçou o Sol", "Fernanda Montenegro");
    livro.marcarDisponivel();

    Estante estante = new Estante();

    estante.adicionarLivro(livro);
    estante.adicionarLivro(livro2);
    estante.removerLivro(livro2);

    }
}