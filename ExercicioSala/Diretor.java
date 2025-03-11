package ExercicioSala;

public class Diretor extends Funcionario implements {
    private final double PREMIO = 0.20;

    public Diretor(String nome, String dataNascimento, Sexo sexo, double salarioBase) {
        super(nome, dataNascimento, sexo, salarioBase);
    }

    private String departamento;
    private int numeroDeFuncionarios;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * PREMIO);
    }
}
