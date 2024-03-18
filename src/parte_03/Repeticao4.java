// Lucas Ferreira Simões
// 18 de março de 2024

package parte_03;

public class Repeticao4 {

    public static void main(String[] args) {
        //calcular o fatorial do numero escolhido (numeros positivos)

        int chosenNumber = 9;
        int factorial = 1;
        int i = chosenNumber;
        while (i != 0){
            factorial *= i;
            i--;
        }
        System.out.printf("O fatorial do número escolhido, %d, é igual a %d!", chosenNumber, factorial);

    }

}
