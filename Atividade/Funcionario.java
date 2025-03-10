package Atividade;

public abstract class Funcionario {
    private String nome;
    private String email;
    private float salario;
    private Endereco endereco;

    public Funcionario(String nome, String email, float salario, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.endereco = endereco;
    }

    // Métodos get e set para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos get e set para email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Métodos get e set para salario
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    // Métodos get e set para endereco
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Método toString detalhado
    @Override
    public String toString() {
        return "\n==Funcionario==" +
                "\nNome: " + nome + '\'' +
                "\nE-mail: " + email + '\'' +
                "\nSalario: " + salario +
                "\nEndereço: " + endereco +
                '}';
    }
}
