// Lucas Ferreira Simões
// 18 de março de 2024

package parte_03;

public class Repeticao2 {

    public static void main(String[] args) {
        // imprimir a soma de todos os numeros entre 100 e 1000

        int inicio = 100;
        int fim = 1000;
        int i = inicio+1;
        int soma = 0;
        System.out.println("Iniciando contagem!");
        do{
            soma += i;
            i++;
        } while(i < fim-1);
        System.out.printf("A soma de todos os números entre %d e %d, de %d até %d, é %d!", inicio, fim, inicio+1, fim-1, soma);

    }

}
