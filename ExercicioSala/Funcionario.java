package ExercicioSala;

public abstract class Funcionario {
    protected String nome;
    protected String dataNascimento;
    protected Sexo sexo;
    protected double salarioBase;

    public Funcionario(String nome, String dataNascimento, Sexo sexo, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.salarioBase = salarioBase;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    
    @Override
    public String toString() {
        return "Funcionario:\n" +
                "Nome: " + nome + '\n' +
                "Data de Nascimento: " + dataNascimento + '\n' +
                "Sexo: " + sexo + '\n' +
                "Salário Base: " + salarioBase;
    }
}
