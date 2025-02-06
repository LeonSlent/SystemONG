import java.time.LocalDate;
import java.util.UUID;

public class Adocao {
    private String id;
    private Animal animal;
    private LocalDate dataAdocao;
    private Adotante adotante;
    private String status; //Pendente, aprovado ou cancelado
    private Funcionario funcionario;

    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Adotante getAdotante() {
        return adotante;
    }
    public void setAdotante(Adotante adotante) {
        this.adotante = adotante;
    }
    public LocalDate getDataAdocao() {
        return dataAdocao;
    }
    public void setDataAdocao(LocalDate dataAdocao) {
        this.dataAdocao = dataAdocao;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Adocao(Adotante adotante, Funcionario funcionario, Animal animal) {
        this.id = UUID.randomUUID().toString(); //Adiciona um ID unico
        this.adotante = adotante;
        this.animal = animal;
        this.funcionario = funcionario;
        this.dataAdocao = LocalDate.now();
        this.status = "Pendente"; //Status pendente é o status inicial

            animal.setAdotado(true);
            adotante.adicionarAnimalAdotado(animal);


    }
}


