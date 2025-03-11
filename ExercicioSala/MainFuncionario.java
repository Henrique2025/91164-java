package ExercicioSala;

public class MainFuncionario {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("João", 25, Sexo.MASCULINO, Setor.OPERACOES, 1000);
        System.out.println(motoboy);

        Diretor diretor = new Diretor("Maria", 30, Sexo.FEMININO, Setor.FINANCEIRO, 5000);
        System.out.println(diretor);

        
    }

}
