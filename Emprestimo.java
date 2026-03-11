public class Emprestimo {

    private Usuario usuario;
    private Livro livro;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
    }

    public void realizarEmprestimo() {

        if (livro.isDisponivel()) {

            livro.emprestar();

            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("Usuário: " + usuario.getNome());
            System.out.println("Prazo de devolução: " + usuario.prazoDevolucao() + " dias");

        } else {
            System.out.println("Livro indisponível");
        }
    }
}
