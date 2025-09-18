import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Livro livro = new Livro("Alclides", "Desconhecido");
    Livro livro2 = new Livro("O homem que abraçou o Sol", "Fernanda Montenegro");
    Livro livro3  = new Livro("Quem é vc Alasca?", "O cara la do romancekkk");
    Livro  livro4 = new Livro("O destemido Dragrão","Appolo");
    livro.marcarDisponivel();
    livro2.marcarDisponivel();
    livro3.marcarDisponivel();

    Aluno user = new Aluno("Alclides");


    Estante estante = new Estante();

    estante.adicionarLivro(livro);
    estante.adicionarLivro(livro2);
    estante.adicionarLivro(livro3);
    estante.mostrarLivrosdisponiveis();

    user.adicionarLivroEmprestado(livro);










    }


}