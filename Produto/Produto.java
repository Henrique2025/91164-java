package Produto;

public abstract class Produto {
    protected String marca;
    protected String cor;
    protected String tamanho;
    protected float preco;
   
    public Produto(String marca, String cor, String tamanho, float preco) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\n== Produto == \nMarca: " + marca + "\nCor: " + cor + "\nTamanho: " + tamanho + "\nPreco: " + preco + "";
    }

    


}
