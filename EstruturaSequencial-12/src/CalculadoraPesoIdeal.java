import java.util.Scanner;

public class CalculadoraPesoIdeal {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira a altura em metros
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble(); // Lê a altura digitada pelo usuário

        // Calcular o peso ideal
        double pesoIdeal = (72.7 * altura) - 58;

        // Exibir o resultado
        System.out.println("O peso ideal é: " + pesoIdeal + " kg");

        // Fechar o objeto Scanner
        scanner.close();
    }
}
