package Pessoa;

public class MainPessoa {
    public static void main(String[] args) {
    
        Cliente cliente1 = new Cliente("Marta", "21", "30/12/24", "Cartão");
        
        System.out.println(cliente1.toString());

        Funcionario funcionario1 = new Funcionario("José", "27", "0000", "Gerente", 2.000);
        System.out.println(funcionario1.toString());
       
    }

}
