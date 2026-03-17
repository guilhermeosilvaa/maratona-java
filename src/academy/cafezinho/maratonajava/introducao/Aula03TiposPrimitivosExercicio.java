package academy.cafezinho.maratonajava.introducao;

import java.time.LocalDate;

/*
Praticar
Crie variáveis para os campos descritos abaico <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salario de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Guilherme O. Silva";
        String endereço = "Av Anjos das Graças";
        double salarioRecebido = 3035.12;
        LocalDate dataRecebimento = LocalDate.of(2026, 3, 17);

        String relatorioDados = "Eu " +nome+ ", morando no endereço " +endereço+ ", confirmo que recebi o salario de " +
                +salarioRecebido+ ", na data " +dataRecebimento;
        System.out.println(relatorioDados);
    }
}
