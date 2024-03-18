// Lucas Ferreira Simões
// 18 de março de 2024

package parte_02;

import java.util.Scanner;

public class Condicional4 {

    public static void main(String[] args){
        // Conceitos com base na nota

        Scanner input = new Scanner(System.in);

        System.out.print("Insira a nota do aluno: ");
        float nota = input.nextFloat();


        if (nota >= 101) {
            System.out.println("A nota inserida é maior que 100. Ajuste sua escala. Se estiver correta, esse estudante é rank S.");
        } else if(nota >= 90) {
            System.out.println("O estudante é rank A.");
        } else if(nota >= 80) {
            System.out.println("O estudante é rank B.");
        } else if(nota >= 70) {
            System.out.println("O estudante é rank C.");
        } else if(nota >= 60) {
            System.out.println("O estudante é rank D.");
        } else if(nota >= 40) {
            System.out.println("O estudante é rank E.");
        } else if(nota >= 0) {
            System.out.println("O estudante é rank F.");
        } else if(nota <= (-1)){
            System.out.println("A nota inserida é negativa. Verifique seus cálculos e tente novamente. Se estiver correta, mate-o... Ele é uma ameaça para a sociedade - um verdadeiro psicopata.");
        } else {
            System.out.println("O estudante não se encaixa em nenhum conceito."); // só pro caso de bugar
        }

    }

}
