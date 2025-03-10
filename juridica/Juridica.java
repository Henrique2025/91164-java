package juridica;

public class Juridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;

    public Juridica(String nome, String telefone, String cnpj, String inscricaoEstadual) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    // Métodos get e set para cnpj
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Métodos get e set para inscricaoEstadual
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    // Método toString
    @Override
    public String toString() {
        return "== Juridica ==" +
                "\nNome:" + getNome() + '\'' +
                "\nTelefone: " + getTelefone() + '\'' +
                "\ncnpj: " + cnpj + '\'' +
                "\nInscrição Estadual: " + inscricaoEstadual + '\'' +
                '}';
    }
}
