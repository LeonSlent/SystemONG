import java.time.LocalDate;

public abstract class Vacina {

    private int id;
    private String nome;
    private String fabricante;
    private String tipo;
    private Date validade;
    private int dose;
    private int lote;
    private Date dataAplicacao;

    public Vacina(int id, String nome, String fabricante, String tipo, Date validade, int dose, int lote, Date dataAplicacao) {
        this.id = id.;
        this.nome = nome;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.validade = validade;
        this.dose = dose;
        this.lote = lote;
        this.dataAplicacao = dataAplicacao;
    }

    //getters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getFabricante() {
        return fabricante;
    }
    public String getTipo () {
        return tipo;
    }
    public Date getValidade() {
        return validade;
    }
    public int getDose() {
        return dose;
    }
    public int getLote() {
        return lote;
    }
    public Date getDataAplicacao() {
        return dataAplicacao;
    }


    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setValidade(Date validade){
        this.validade = validade;
    }
    public void setDose(int dose){
        this.dose = dose;
    }
    public void setLote(int lote){
        this.lote = lote;
    }
    public void setDataAplicacao(Date dataAplicacao){
        this.dataAplicacao = dataAplicacao;
    }
}

