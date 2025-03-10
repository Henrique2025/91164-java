package Atividade;

public class Medico extends Funcionario {
    private String crm;

    public Medico(String nome, String email, float salario, Endereco endereco, String crm) {
        super(nome, email, salario, endereco);
        this.crm = crm;
    }

    // Métodos get e set para crm
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    // Método toString
    @Override
    public String toString() {
        return "\n== Medico ==" +
                "\nNome: " + getNome() + '\'' +
                "\nE-mail: " + getEmail() + '\'' +
                "\nSalario: " + getSalario() +
                "\nEndereco: " + getEndereco() +
                "\ncrm: " + crm + '\'' +
                '}';
    }
}
