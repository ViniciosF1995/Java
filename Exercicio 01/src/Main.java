import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Escreva um programa que determine se um número é positivo, negativo ou zero.

        int i = 0;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("DIgite um numero: "));

        if (numero > i) {

            System.out.println(numero + " O numero é positivo");
        } else {
            if (numero < i) {
                System.out.println(numero + " O numero é negativo");
            } else {

                System.out.println(numero + " 0 é nulo");
            }

        }
    }
}
