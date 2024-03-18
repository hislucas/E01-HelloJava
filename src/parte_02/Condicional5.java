// Lucas Ferreira Simões
// 18 de março de 2024

package parte_02;

import java.util.Scanner;

public class Condicional5 {

    public static void main(String[] args) {
        // verificar qual número é maior entre os dois

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float numberOne = input.nextFloat();
        System.out.print("Digite outro número: ");
        float numberTwo = input.nextFloat();
        double soma = numberOne-numberTwo;
        if (soma < 0){
            System.out.println("O segundo número, "+ numberTwo +", é maior que o primeiro, "+ numberOne +"!");
        } else if (soma > 0) {
            System.out.println("O primeiro número, "+ numberOne +", é maior que o segundo, "+ numberTwo +"!");
        } else if (soma == 0) {
            System.out.println("Para mim, os dois números parecem ser iguais.");
        } else {
            System.out.println("Sinto por informá-lo que seus números não se encaixam na medida do programa.");
        }

    }

}
