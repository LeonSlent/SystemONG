public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;

    public Pessoa(String nome, String cpf, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
}