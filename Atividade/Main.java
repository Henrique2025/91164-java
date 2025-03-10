package Atividade;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 1", "123", "Casa", "12345-678", "Cidade 1");
        Medico medico = new Medico("João", "medico@gmail.com", 10000, endereco, "123456");
        Engenheiro engenheiro = new Engenheiro("Maria", "maria@gmail.com", 15000, endereco, "654321");
        
        System.out.println(medico);
        
        System.out.println(engenheiro);
                     
    
    }
}
