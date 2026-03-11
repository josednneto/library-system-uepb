public class Aluno extends Usuario {
    private String matricula;

    public Aluno(String nome, String cpf, String email, String matricula) {
        super(nome, cpf, email);
        this.matricula = matricula;
    }
}
