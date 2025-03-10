package Atividade;

public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro(String nome, String email, float salario, Endereco endereco, String crea) {
        super(nome, email, salario, endereco);
        this.crea = crea;
    }

    // Métodos get e set para crea
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    // Método toString detalhado
    @Override
    public String toString() {
        return "\n== Engenheiro ==" +
                "\nNome: " + getNome() + '\'' +
                "\nE-mail: " + getEmail() + '\'' +
                "\nSalario: " + getSalario() +
                "\nEndereco: " + getEndereco() +
                "\nCrea: " + crea + '\'' +
                '}';
    }

}
