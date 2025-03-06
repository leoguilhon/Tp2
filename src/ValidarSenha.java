
import java.util.Scanner;


public class ValidarSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senhaOriginal = scanner.nextLine();

        boolean senhaBln = false;

        while (!senhaBln) {
            System.out.println("Digite a senha cadastrada: ");
            String senhaDigitada = scanner.nextLine();
            if (!senhaDigitada.equals(senhaOriginal)) {
                System.out.println("Senha incorreta.");
            } else {
                System.out.println("Senha correta!");
                senhaBln = true;
            }
        }
    }
}