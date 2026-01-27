package academy.devdojo.maratonajava.introducao;
import java.time.LocalDate;

/*
Pratica

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensaem:

Eu <nome>, morando no endereco <endereco> confirmo que recebi o salário de <salario>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Guilherme O. Silva";
        String endereco = "Rua tal nº30";
        double salarioGui = 2550.36;
        LocalDate data = LocalDate.parse("2026-01-27");
        String relatorio = "Eu "+nome+", morando no endereco " +endereco+ " confirmo que recebi o salário de "+salarioGui+ ", na data " +data;
        System.out.println(relatorio);
    }

}
