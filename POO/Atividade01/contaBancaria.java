public class contaBancaria {

    private String banco;
    private String angencia;
    private int numeroAgencia;
    private String tipoCota;
    private float saldoAtual;
    private float limiteDisponivel;   
  
    public contaBancaria() {
    }

    public contaBancaria(String banco, String angencia, int numeroAgencia, String tipoCota, float saldoAtual,
            float limiteDisponivel) {
        this.banco = banco;
        this.angencia = angencia;
        this.numeroAgencia = numeroAgencia;
        this.tipoCota = tipoCota;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAngencia() {
        return angencia;
    }

    public void setAngencia(String angencia) {
        this.angencia = angencia;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getTipoCota() {
        return tipoCota;
    }

    public void setTipoCota(String tipoCota) {
        this.tipoCota = tipoCota;
    }

    public float getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(float saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public float getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(float limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "contaBancaria [banco=" + banco + ", angencia=" + angencia + ", numeroAgencia=" + numeroAgencia
                + ", tipoCota=" + tipoCota + ", saldoAtual=" + saldoAtual + ", limiteDisponivel=" + limiteDisponivel
                + "]";
    }

    

}
