package Exercicios;

public class MainPr {
    public static void main(String[] args) {
        
        Vendedor vendedor = new Vendedor("Claudio", "22");
        System.out.println(vendedor.toString());

        Processador processador1 = new Processador("Longin", "L500", "2660");
        System.out.println(processador1.toString());
  
        Memoria memoria1 = new Memoria("Intel Core ", "coreI5", "4,6");
        System.out.println(memoria1.toString());
   
        PlacaMae placaMae1 = new PlacaMae();
        System.out.println(placaMae1.toString());

        DipositivoDeArmazenamento dipositivoDeArmazenamento = new DipositivoDeArmazenamento(null, null, "32GB", null);
        System.out.println(dipositivoDeArmazenamento.toString());

    }

}
