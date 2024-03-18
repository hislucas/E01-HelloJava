// Lucas Ferreira Simões
// 18 de março de 2024

package parte_03;

public class Repeticao3 {

    public static void main(String[] args) {
        // imprimir todos os multiplos de 7 entre 1 e 100

        int inicio = 1, fim = 100, i = inicio+1;
        do{
            if ((i%7) == 0) {
                System.out.printf("%d | ", i); }
            i++;
        } while(i < fim);

    }
}
