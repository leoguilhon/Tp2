import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalcularIdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia de nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês de nascimento (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int ano = scanner.nextInt();

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia); // cria a data de nascimento
        LocalDate dataAtual = LocalDate.now(); // data de hoje

        long idadeEmDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual); // calcula os dias totais

        System.out.println("Sua idade em dias é: " + idadeEmDias);

        scanner.close();
    }
}
