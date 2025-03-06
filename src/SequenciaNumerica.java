import java.util.Scanner;

public class SequenciaNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial da sequência: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite o incremento da sequência: ");
        int incremento = scanner.nextInt();

        int valorAtual = valorInicial;
        StringBuilder sequencia = new StringBuilder();

        while (valorAtual <= 100) {
            sequencia.append(valorAtual).append(", ");
            valorAtual += incremento;
        }

        sequencia.delete(sequencia.length() - 2, sequencia.length());

        System.out.println("Sequência numérica: " + sequencia);

        scanner.close();
    }
}

