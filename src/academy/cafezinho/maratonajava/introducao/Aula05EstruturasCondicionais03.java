package academy.cafezinho.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 7000;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        // (condicao) ? verdadeiro : falso
        String resultado = salario > 6000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
