import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        if (valor1 > valor2) {
            System.out.println("Maior: " + valor1);
        } else {
            System.out.println("Maior: " + valor2);
        }

        scanner.close();
    }
}