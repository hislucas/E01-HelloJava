package parte_01;

public class Main { // BalancoTrimestral

    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        float gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarco);

        System.out.printf("Gastos do Trimestre: R$%.2f\n", gastosTrimestre);
        System.out.printf("Média de Gastos: R$%.2f\n", (gastosTrimestre/3));


    }

}
