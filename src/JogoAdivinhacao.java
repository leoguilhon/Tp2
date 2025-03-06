import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int chute;
        boolean acertou = false;

        System.out.println("=== Jogo de Adivinhação ===");
        System.out.println("Tente adivinhar o número entre 1 e 100!");

        while (!acertou) {
            System.out.print("Digite seu chute: ");
            chute = scanner.nextInt();

            if (chute < numeroSecreto) {
                System.out.println("O número secreto é maior!");
            } else if (chute > numeroSecreto) {
                System.out.println("O número secreto é menor!");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroSecreto + "!");
                acertou = true;
            }
        }

        scanner.close();
    }
}