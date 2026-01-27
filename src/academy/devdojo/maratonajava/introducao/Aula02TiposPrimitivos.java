package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        String name = "Guilherme";
        int age = (int) 1000000000000L; //cast
        long numberBig = 1000000;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte ageByte = 10;
        short ageShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        System.out.println("A idade é de "+name+" é "+age+" anos" );
        System.out.println(falso);
        System.out.println("char "+caractere);
    }
}
