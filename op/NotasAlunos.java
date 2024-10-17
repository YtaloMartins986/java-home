import java.util.Scanner;
public class NotasAlunos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a sua primeira media: ");{
            float media1 = teclado.nextFloat();{
                System.out.print("Digite a sua segunda nota: ");
                float media2 = teclado.nextFloat();
                float m = (media1+media2)/2;
                if (m>9){
                    System.out.print("Sua media foi "+m+" Parabens!");
                }
            }

        }
    }
}
