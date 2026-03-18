package academy.cafezinho.maratonajava.praticarNivel1;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        //Peça um número e diga se ele é par ou ímpar.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é PAR");
        } else {
            System.out.println("O número é ÍMPAR");
        }

        scanner.close();
    }
}
