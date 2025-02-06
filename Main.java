import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando um funcionario
        Funcionario funcionario = new Funcionario("João", "123456789", "999999999", "joao@empresa.com", "Rua X, 123");
        funcionario.setCargo("Atendente");
        funcionario.setSalario(2000.00);
        funcionario.setCargaHoraria(40);

        // Criando um Adotante
        Adotante adotante = new Adotante("Maria", "987654321", "888888888", "maria@exemplo.com", "Rua Y, 456");

        // Criando animais (gato e cachorro)
        Gato gato = new Gato(1, "Felix", "Felino", "Persa", 2, "Pequeno", false, "Saudável", true, true);
        Cachorro cachorro = new Cachorro(2, "Rex", "Canino", "Labrador", 4, "Grande", false, "Saudável", true, true);

        // Criando a adoção
        new Adocao(adotante, funcionario, gato);
        new Adocao(adotante, funcionario, cachorro);

        // Exibindo os animais adotados
        System.out.println("Animais adotados por " + adotante.getNome() + ":");
        List<Animal> animaisAdotados = adotante.getAnimaisAdotados();
        for (Animal animal : animaisAdotados) {
            System.out.println("ID: " + animal.getId() + ", Nome: " + animal.getNome() + ", Espécie: " + animal.getEspecie());
        }
    }
}
