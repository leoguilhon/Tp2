import java.util.Scanner;

public class ConverterMoedas {

    public static String formatarValor(double numero) {
        return String.format("%.2f", numero);
    }

    public static void main(String[] args) {

        double cotacaoDolar = 5.8;
        double cotacaoEuro = 6.2;
        double cotacaoLibra = 7.4;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em reais: ");

        double valorReais = scanner.nextDouble();

        scanner.nextLine();

        boolean escolheu = false;
        String tipoMoeda = "";

        while (!escolheu) {
            System.out.print("Escolha uma moeda (dólar, euro ou libra): ");
            tipoMoeda = scanner.nextLine();
            tipoMoeda = tipoMoeda.toLowerCase();
            if (tipoMoeda.equals("dólar") || tipoMoeda.equals("dolar") || tipoMoeda.equals("libra") || tipoMoeda.equals("euro")) {
                escolheu = true;
            } else {
                System.out.println("Moeda inválida.");
            }
        }
        if (tipoMoeda.equals("dolar") || tipoMoeda.equals("dólar")) {
            double valorDolar = valorReais/cotacaoDolar;
            System.out.println("Valor convertido para dólar: $ " + formatarValor(valorDolar));
        }
        if (tipoMoeda.equals("euro")) {
            double valorEuro = valorReais/cotacaoEuro;
            System.out.println("Valor convertido para euro: € " + formatarValor(valorEuro));
        }
        if (tipoMoeda.equals("libra")) {
            double valorLibra = valorReais/cotacaoLibra;
            System.out.println("Valor convertido para libra: £ " + formatarValor(valorLibra));
        }
    }
}
