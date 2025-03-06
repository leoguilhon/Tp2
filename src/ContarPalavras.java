import java.util.Scanner;

public class ContarPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().trim();

        if (frase.isEmpty()) {
            System.out.println("A frase não contém palavras.");
        } else {
            String[] palavras = frase.split("\\s+");
            int totalPalavras = palavras.length;

            System.out.println("Total de palavras na frase: " + totalPalavras);
        }

        scanner.close();
    }
}