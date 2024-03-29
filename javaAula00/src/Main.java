import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean sextou = false;
        char letra = 'A';
        String nome = "Ferialdo";
        int idade = 22;
        float salario = 18.444f;
        System.out.println("Sextou: " + sextou);
        System.out.println("Feriado:" + nome);
        System.out.println("Caracter: " + letra);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("======================");

        System.out.printf("O valor do salário é %.2f", salario);

        System.out.println("\n======================");

        float media = 6f;
        System.out.printf("\n A média de %s foi %.1f", nome, media);
        System.out.format("\n A média de %s foi %.1f", nome, media);

        System.out.println("\n======================");

        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite o nome do Aluno: ");
        String nomeAluno = teclado.nextLine();
        System.out.print("\nDigite o nota do Aluno: ");
        float nota = teclado.nextFloat();
        System.out.printf("Nome: %s \nNota: %.1f", nomeAluno, nota);
    }
}