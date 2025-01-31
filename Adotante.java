import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Adotante extends Pessoa {
    private List<Animal> animaisAdotados;
    private String id;

    public Adotante(String nome, String cpf, String telefone, String email, String endereco) {
        super(endereco, nome, cpf, telefone, email);
        this.id UUID.randomUUID().toString();
        this.animaisAdotados = new ArrayList<>();

    }
}
