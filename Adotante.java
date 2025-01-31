import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Adotante extends Pessoa {
    private List<Animal> animaisAdotados;
    private String id;

    public List<Animal> getAnimaisAdotados() {
        return animaisAdotados;
    }

    public void setAnimaisAdotados(List<Animal> animaisAdotados) {
        this.animaisAdotados = animaisAdotados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Adotante(String nome, String cpf, String telefone, String email, String endereco) {
        super(endereco, nome, cpf, telefone, email);
        this.id = UUID.randomUUID().toString();
        this.animaisAdotados = new ArrayList<>();

    }
}
