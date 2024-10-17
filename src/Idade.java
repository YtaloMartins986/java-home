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

        // estrutura condicional composta maior/menor

        if (resul>=18) {
            System.out.println("Voce tem "+resul+" anos, ja e de Maior");
        }else{
            System.out.println("Voce tem "+resul+" anos, ainda e de Menor");
        }














    }
}

