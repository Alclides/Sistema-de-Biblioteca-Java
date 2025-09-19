import java.beans.PropertyDescriptor;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Livro livro = new Livro("Raposa de 9 caldas", "Alclides");
    Livro livro2 = new Livro("O homem que abraçou o Sol", "Fernanda Montenegro");
    Livro livro3  = new Livro("Quem é vc Alasca?", "O cara la do romancekkk");
    Livro  livro4 = new Livro("O destemido Dragrão","Appolo");
    Estante estante = new Estante();
    estante.adicionarLivro(livro);
    estante.adicionarLivro(livro2);
    estante.adicionarLivro(livro3);
    estante.adicionarLivro(livro4);

    Aluno aluno = new Aluno("Alclides");
    Professor professor = new Professor("Emerson");

    Bibliotecaria bibliotecaria = new Bibliotecaria();

    bibliotecaria.emprestarLivro(livro, professor, estante);
    bibliotecaria.emprestarLivro(livro2, aluno, estante);










    }


}