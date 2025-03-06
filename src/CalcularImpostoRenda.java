import java.util.Scanner;

public class CalcularImpostoRenda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário bruto anual: ");
        double salario = scanner.nextDouble();
        double imposto = 0.0;
        double salarioLiquido;

        if (salario <= 20000) {
            imposto = 0.0; // isento
        } else if (salario <= 40000) {
            imposto = (salario - 20000) * 0.10;
        } else if (salario <= 60000) {
            imposto = (20000 * 0.10) + (salario - 40000) * 0.20;
        } else {
            imposto = (20000 * 0.10) + (20000 * 0.20) + (salario - 60000) * 0.30;
        }

        // Faixas salariais para 20.000, 40.000 e 60.000 com aliquotas de 10%, 20% e 30%.

        salarioLiquido = salario - imposto;

        System.out.printf("Imposto de Renda a pagar: R$ %.2f%n", imposto);
        System.out.printf("Salário líquido anual: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}