import java.util.Scanner;
public class VotoOuNao {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

        // digite data de nascimento

        System.out.print("Digite a sua data de nascimento: ");
        int valorNas = entrada.nextInt();

        // digite ano atual

        System.out.print("Digite o ano atual: ");
        int valorAno = entrada.nextInt();

        // resultado da idade

        int resul = valorAno - valorNas;

        // estrutura condicional composta VotaOuNao?

        if (resul<16){
            System.out.println("Nao vota");

        } else if (resul<18){
            System.out.println("Voto opcional");

        } else if (resul<=70){
            System.out.println("Voto obrigatorio");
        } else {
            System.out.println("Voto opcional");
        }







    }

 }

