import java.util.Scanner;

public class CadastrarUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");

        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");

        int idade = scanner.nextInt();

        scanner.nextLine(); // quebrar a linha

        System.out.print("Digite o nome do seu pai: ");

        String nomePai = scanner.nextLine();

        System.out.print("Digite o nome da sua mãe: ");

        String nomeMae = scanner.nextLine();

        scanner.close();

        if (nome.length() > nomePai.length() || nome.length() > nomeMae.length()){
            System.out.println("Comprimento do nome aceitável.");
            System.out.println("Nome: " + nome + " | Idade: " + idade + " | Nome do pai: " + nomePai + " | Nome da mãe: " + nomeMae);
        } else {
            System.out.println("ATENÇÃO! Comprimento do nome muito curto!");
            System.out.println("Nome: " + nome + " | Idade: " + idade + " | Nome do pai: " + nomePai + " | Nome da mãe: " + nomeMae);
        }
    }
}
