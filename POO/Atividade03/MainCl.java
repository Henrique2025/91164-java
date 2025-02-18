// import Atividade03.Cliente03;

public class MainCl {
    public static void main(String[] args) {
        
        Cliente03 cliente = new Cliente03();

        cliente.setNome("Claudio");
        cliente.setIdade(20);
        cliente.setPet("Pastor Alemão");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Pet: " + cliente.getPet());

        System.out.println("\n==Exibindo dados do Pet==");

        Pet pet = new Pet("lobo", 10, "pastor Alemão");
        System.out.println(pet.toString());

        

    }

}
