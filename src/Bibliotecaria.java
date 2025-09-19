public class Bibliotecaria {
    public boolean emprestarLivro(Livro livro, Usuario usuario, Estante estante) {
        if(livro.estaDisponivel()) {
            System.out.println("O livro " + livro + " não esta disponivel!");
            return false;

        }
        if(!usuario.podePegarEmprestado()) {
            System.out.println("\nO usuario não pode pegar mais livros!");
            return false;
        }

        Livro livroEncontrado = estante.buscarLivroPorTitulo(livro.getNome());
        System.out.println(livroEncontrado);
        if (livroEncontrado == null || !livroEncontrado.equals(livro)) {
            return false;
        }

        livro.marcarEmprestado();
        usuario.adicionarLivroEmprestado(livro);
        estante.removerLivro(livro);
        System.out.println("Livro" + livro + " emprestado com sucesso para = " + usuario.getNome());


        return true;

    }


}
