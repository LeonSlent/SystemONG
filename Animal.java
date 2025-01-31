public abstract class Animal {

    private int id;
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private String porte;
    private boolean adotado;
    private String historicoSaude;
    private boolean vacinado;
    private boolean castrado;

    public Animal(int id, String nome, String especie, String raca, int idade, String porte, boolean adotado, 
    String historicoSaude, boolean vacinado, boolean castrado) {
        this.id = id; //id único
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.porte = porte;
        this.adotado = adotado;
        this.historicoSaude = historicoSaude; //informações sobre condições prévias do animal
        this.vacinado = vacinado;
        this.castrado = castrado;
    }
    //getters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    } 
    public String getEspecie(){
        return especie;
    }
    public String getRaca() {
        return raca;
    }
    public int getIdade() {
        return idade;
    }
    public String getPorte() {
        return porte;
    }
    public boolean getAdotado() {
        return adotado;
    }
    public String getHistoricoSaude() {
        return historicoSaude;
    }
    public boolean getVacinado() {
        return vacinado;
    }
    public boolean getCastrado() {
        return castrado;
    }

    //setters
    public void setId(int id) {
        this.id = id; 
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }
    public void setAdotado(boolean adotado) {
        this.adotado = adotado;
    }
    public void setHistoricoSaude(String historicoSaude) {
        this.historicoSaude = historicoSaude;
    }
    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }
    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
}
