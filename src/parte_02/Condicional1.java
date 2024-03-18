// Lucas Ferreira Simões
// 18 de março de 2024

package parte_02;

import java.util.Scanner;

public class Condicional1 {

    public static void main(String[] args) {
        // Verifica se um número é par ou ímpar

        Scanner input = new Scanner(System.in);

        int numberOne;

        System.out.print("Insira um numero e eu verificarei se ele é ímpar ou par: ");
        numberOne = input.nextInt();

        if ((numberOne % 2) == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }

    }

}
