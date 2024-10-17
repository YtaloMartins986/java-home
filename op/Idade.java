import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // data de nascimento

        System.out.print("Digite a sua data de nascimento: ");
        int valorNas = entrada.nextInt();

        // ano atual

        System.out.print("Digite o ano atual: ");
        int valorAno = entrada.nextInt();

        // resultado da idade

        int resul = valorAno - valorNas;
        System.out.println("a sua idade em "+valorAno+" e "+resul);










    }
}

