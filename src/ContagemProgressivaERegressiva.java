import java.util.Scanner;
    public class ContagemProgressivaERegressiva {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        // Sistema de entrada de valores [SEV]

        System.out.println("Digite o numero que voce quer comecar a contagem: ");
        int continic = entrada.nextInt();
        System.out.println("Digite em que numero voce pretende parar a contagem: ");
        int contfim = entrada.nextInt();

        //Contagem Progressiva

        if (continic < contfim){
            System.out.println("-------------------");
            System.out.println(continic);
            while (continic < contfim){
                int c = ++continic;
                System.out.println(c);
            }

            // Contagem Regressiva

        }else if (continic > contfim){
            System.out.println("-------------------");
            System.out.println(continic);
            while (continic > contfim){
                int c = --continic;
                System.out.println(c);
            }
        }














    }

}
