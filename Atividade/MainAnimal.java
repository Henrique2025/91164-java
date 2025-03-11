package Atividade;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Pato pato = new Pato();
        Galo galo = new Galo();
        cachorro.som();
        cachorro.comer();
        pato.som();
        pato.comer();
        galo.som();
        galo.comer();
    }

}
