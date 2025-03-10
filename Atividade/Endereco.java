package Atividade;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;

    // Construtor
    public Endereco(String logradouro, String numero, String complemento, String cep, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
    }

    // Métodos get e set para logradouro
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    // Métodos get e set para numero
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Métodos get e set para complemento
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    // Métodos get e set para cep
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    // Métodos get e set para cidade
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

   
}
