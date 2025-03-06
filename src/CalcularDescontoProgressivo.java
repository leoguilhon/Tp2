import java.util.Scanner;

public class CalcularDescontoProgressivo {

    public static String formatarValor(double numero) {
        return String.format("%.2f", numero);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");

        double valor = scanner.nextDouble();

        scanner.nextLine(); // Pular linha

        double valorFinal;
        double valorDesconto;

        if (valor > 0){
            if (valor < 500) {
                valorFinal = valor;
                System.out.println("Sem desconto. Valor final: R$ " + valorFinal);
            } else if (valor <= 1000) {
                valorDesconto = valor*0.05;
                valorFinal = (valor*0.95);
                String valorFinalStr = formatarValor(valorFinal);
                System.out.println("Desconto de 5% aplicado. (R$"+valorDesconto+") | Valor final: R$ " + valorFinalStr);
            } else {
                valorDesconto = valor*0.1;
                valorFinal = valor*0.90;
                String valorFinalStr = formatarValor(valorFinal);
                System.out.println("Desconto de 10% aplicado. (R$"+valorDesconto+") | Valor final: R$ " + valorFinalStr);
            }
        } else {
            System.out.println("Insira um valor positivo!");
        }
    }
}