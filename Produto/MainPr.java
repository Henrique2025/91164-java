package Produto;

public class MainPr {
    public static void main(String[] args) {
        
        Camisa camisa = new Camisa("Adidas", "Preta", "M", 499);
        System.out.println(camisa.toString());

        Calca calca = new Calca("Adidas", "Preto", "M", 250);
        System.out.println(calca.toString());

        Sapato sapato = new Sapato("Adidas", "Branco", "39", 350);
        System.out.println(sapato.toString());
    
    }

}
