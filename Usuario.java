public class Usuario {

    protected String nome;
    protected String cpf;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int prazoDevolucao() {
        return 7;
    }
}
