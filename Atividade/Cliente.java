public class Cliente {

    private String nome;
    private String idade;
    private Endereco cidade;
    
    public Cliente(String nome, String idade, Endereco cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Endereco getCidade() {
        return cidade;
    }

    public void setCidade(Endereco cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", idade=" + idade + ", cidade=" + cidade + "]";
    }

    

}
