// Lucas Ferreira Simões
// 18 de março de 2024

package parte_03;

public class Repeticao1 {

    public static void main(String[] args) {
        // imprimir todos os numeros entre 100 e 1000

        int inicio = 100;
        int fim = 1000;
        int i = inicio+1;
        System.out.println("Iniciando contagem!");
        do{
            System.out.printf("%d, ", i);
            i++;
            if (i == fim-1) { System.out.printf("%d!!!\n", i); }
        } while(i < fim-1);

    }

}
