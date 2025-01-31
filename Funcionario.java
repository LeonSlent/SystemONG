import java.time.LocalDate;
import java.util.UUID;

public class Funcionario extends Pessoa {
    private String id;
    private String cargo;
    private double salario;
    private LocalDate dataDeContatacao;
    private int cargaHoraria;

    public Funcionario(String nome, String cpf, String telefone, String email, String endereco) {
        super(endereco, nome, cpf, telefone, email);
        this.id = UUID.randomUUID().toString();
        this.cargo = cargo;
        this.salario = 0;
        this.dataDeContatacao = LocalDate.now();
        this.cargaHoraria = 0;
    }
}