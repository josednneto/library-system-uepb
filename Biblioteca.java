import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Usuario> usuarios = new ArrayList<>();
    private List<Livro> livros = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();


    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {

        if (livro.isDisponivel()) {

            livro.emprestar();

            Emprestimo emprestimo = new Emprestimo(usuario, livro);
            emprestimos.add(emprestimo);

            System.out.println("Livro emprestado: " + livro.getTitulo());
            System.out.println("Usuário: " + usuario.getNome());
            System.out.println("Prazo: " + usuario.prazoDevolucao() + " dias");

        } else {
            System.out.println("Livro indisponível");
        }
    }


    public void devolverLivro(Livro livro) {

        for (Emprestimo e : emprestimos) {

            if (e.getLivro() == livro) {

                livro.devolver();
                emprestimos.remove(e);

                System.out.println("Livro devolvido: " + livro.getTitulo());
                return;
            }
        }

        System.out.println("Esse livro não está emprestado.");
    }
}
