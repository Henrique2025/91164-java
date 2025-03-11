package Exercicio;

public class OperacaoMatematica implements Operacao {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }
}
