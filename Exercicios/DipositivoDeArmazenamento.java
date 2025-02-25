package Exercicios;

public class DipositivoDeArmazenamento {
    private String marca;
    private String modelo;
    private String capacidadeArmazenamento;
    private String tipoDeConexao;
    
    public DipositivoDeArmazenamento() {
    }

    public DipositivoDeArmazenamento(String marca, String modelo, String capacidadeArmazenamento,
            String tipoDeConexao) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public String toString() {
        return "\n== Dipositivo De Armazenamento == \nMarca :" + marca + "\nModelo :" + modelo + "\nCapacidade Armazenamento: "
                + capacidadeArmazenamento + "\nTipoDeConexao :" + tipoDeConexao + "\nGetMarca():" + getMarca()
                + "\nGetModelo() :" + getModelo() + "\nGetCapacidadeArmazenamento() :" + getCapacidadeArmazenamento()
                + "\nGetTipoDeConexao():" + getTipoDeConexao() +  "\n";
    }
    
    

}
