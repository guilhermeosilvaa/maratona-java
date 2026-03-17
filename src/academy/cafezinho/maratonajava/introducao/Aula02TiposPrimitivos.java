package academy.cafezinho.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
    // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L; //cast
        long numeroGrande = 1000000L;
        double salarioDouble = 2000.0;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;
        String nome = "Cafezinho";

        System.out.println("A minha idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(salarioFloat);
        System.out.println("Oi meu nome é "+nome);



    }
}
