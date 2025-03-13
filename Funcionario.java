import java.time.LocalDate;
import java.util.UUID;

public class Funcionario extends Pessoa {
    private String id;
    private String cargo;
    private double salario;
    private LocalDate dataDeContatacao;
    private int cargaHoraria;
    
    public Funcionario(String nome, String cpf, String telefone, String email, String endereco) {
    super(nome, cpf, endereco, telefone, email);
    this.id = UUID.randomUUID().toString();
    this.cargo = "";
    this.salario = 0;
    this.dataDeContatacao = LocalDate.now();
    this.cargaHoraria = 0;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public LocalDate getDataDeContatacao() {
        return dataDeContatacao;
    }
    public void setDataDeContatacao(LocalDate dataDeContatacao) {
        this.dataDeContatacao = dataDeContatacao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
}