public class Bibliotecario extends Usuario {

    public Bibliotecario(String nome, String cpf) {
        super(nome, cpf);
    }

    public void cadastrarLivro(Livro livro, Biblioteca biblioteca) {
        biblioteca.adicionarLivro(livro);
    }
}
