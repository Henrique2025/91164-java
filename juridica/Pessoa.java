package juridica;

public abstract class Pessoa {
    protected String nome;
    protected String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Métodos get e set para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos get e set para telefone
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método toString
    @Override
    public String toString() {
        return "== Pessoa ==" +
                "\nNome: " + nome + '\'' +
                "\nTelefone: " + telefone + '\'' +
                '}';
    }
}
