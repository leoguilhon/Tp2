import java.util.Scanner;

public class CalcularMediaNotas {

    public static void main(String[] args) {

        double somaNotas = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            System.out.print("Digite a nota do " + (i+1) + "º bimestre: ");

            double nota = scanner.nextDouble();

            somaNotas += nota;

            scanner.nextLine(); // Pular linha
        }

        double mediaNotas = somaNotas/4;

        if (mediaNotas >= 0 && mediaNotas <= 10){
            if (mediaNotas < 5) {
                System.out.println("Aluno reprovado.");
            } else if (mediaNotas < 6.9) {
                System.out.println("Aluno em recuperação.");
            } else {
                System.out.println("Aluno aprovado.");
            }
            System.out.println("Média: " + mediaNotas);
        } else {
            System.out.println("Insira notas válidas!");
        }
    }
}
