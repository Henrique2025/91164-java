package ExercicioSala;

public class Motoboy extends Funcionario {

    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String dataNascimento, Sexo sexo, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
public double getSalarioFinal() {
        return getSalarioBase();
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Carteira de Habilitação: " + carteiraDeHabilitacao;
    }
}
