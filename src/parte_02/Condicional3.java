// Lucas Ferreira Simões
// 18 de março de 2024

package parte_02;

import java.util.Scanner;

public class Condicional3 {

    public static void main(String[] args) {
        // Verificar se o aluno passou de ano

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int numero = input.nextInt();

        if (numero >= 60){
            System.out.println("O aluno passou de ano!");
        } else {
            System.out.println("O aluno não passou de ano!");
        }

    }

}
