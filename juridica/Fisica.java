package juridica;

public class Fisica extends Pessoa {
    private String cpf;
    private String rg;
    private String dataNascimento;

    public Fisica(String nome, String telefone, String cpf, String rg, String dataNascimento) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    // Métodos get e set para cpf
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Métodos get e set para rg
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    // Métodos get e set para dataNascimento
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método toString
    @Override
    public String toString() {
        return "== Fisica ==" +
                "\nNome: " + getNome() + '\'' +
                "\nTelefone: " + getTelefone() + '\'' +
                "\ncpf: " + cpf + '\'' +
                "\nrg: " + rg + '\'' +
                "\nData Nascimento: " + dataNascimento + '\'' +
                '}';
    }
}
