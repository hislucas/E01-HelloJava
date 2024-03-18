// Lucas Ferreira Simões
// 18 de março de 2024

package parte_02;

import java.util.Scanner;

public class Condicional2 {

    public static void main(String[] args) {
        // Verificar se um numero é múltiplo de 7

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um numero e eu direi se é múltiplo de 7 ou não: ");
        int numero = input.nextInt();

        if (( numero % 7) == 0) {
            System.out.println("O número é múltiplo de 7!");
        } else {
            System.out.println("O número não é múltiplo de 7!");
        }

    }

}
