public class MainCliente {
    public static void main(String[] args) {
        // Cliente1.
        Cliente cliente1 = new Cliente();

        cliente1.setNome("Marta");
        cliente1.setEmail("marta@gmail.com");
        cliente1.setSenha("123");

        // Exibindo dados.
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("E-mail: " + cliente1.getEmail());
        System.out.println("Senha: " + cliente1.getSenha());

        // Cliente2.
        Cliente cliente2 = new Cliente("josé", "jose@gmail.com", "321");
        System.out.println(cliente2.toString());  
      
        Cliente cliente3 = new Cliente("Jão", "Paulo@gmail.com", "543");
        System.out.println(cliente3.toString());  
    }

}
