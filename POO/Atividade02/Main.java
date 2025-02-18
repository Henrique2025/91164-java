public class Main {
public static void main(String[] args) {
 
System.out.println("\n==Exibindo Cliente==");    

    Cliente01 cliente = new Cliente01();

    cliente.setNome("Claudio");
    cliente.setIdade(20);
    cliente.setEndereco("Salvador BA");

    System.out.println("Nome: " + cliente.getNome());
    System.out.println("Idade: " + cliente.getIdade());
    System.out.println("Endereço: " + cliente.getEndereco());
    
System.out.println("\n==Exibindo Endereço==");

    Endereco endereco = new Endereco();

    endereco.setLogradouro("BA");
    endereco.setNumero(83);
    endereco.setCidade("Salvador");

    System.out.println(" Local: " + endereco.getLogradouro());
    System.out.println(" Numero: " + endereco.getNumero());
    System.out.println(" Cidade: " + endereco.getCidade());

}
}
