import java.time.LocalDate;
import java.util.UUID;

public class Adocao {
    private String id;
    private Gato gato;
    private Cachorro cachorro;
    private LocalDate dataAdocao;
    private Adotante adotante;
    private String status; //Pendente, aprovado ou cancelado
    private Funcionario funcionario;

    public Adocao(Adotante adotante, Funcionario funcionario, Gato gato, Cachorro cachorro) {
        this.id = UUID.randomUUID().toString(); //Adiciona um ID unico
        this.adotante = adotante;
        this.gato = gato;
        this.cachorro = cachorro;
        this.funcionario = funcionario;
        this.dataAdocao = LocalDate.now();
        this.status = "Pendente"; //Status pendente é o status inicial

        //Registrar o animal na lista de adoções do adotante
        this.adotante.adicionarAnimalAdotado(gato, cachorro);

    }
}


