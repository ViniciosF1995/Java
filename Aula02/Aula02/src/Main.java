import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        String s1, s2;
//
//        s1= JOptionPane.showInputDialog("S1: ");
//        s2= JOptionPane.showInputDialog("S2: ");
//
//        if(s1.equals(s2)){
//            System.out.println("Iguais");
//
//        }else {
//            System.out.println("Diferentes");
//        }

//Exercicio 01
//        int num, valor = -1;
//
//        for(int i=0; i<10; i++){
//
//            num = Integer.parseInt(JOptionPane.showInputDialog((i+1) + "Numero: ")) ;
//
//            if(num> valor) {
//                valor = num;
//            }
//            System.out.println("O valor maior é: " + valor);
//        }

//=================================================================

        //Exercicio 02

        int num, valor = -1;

        for(int i=0; i<10; i++) {
            do {
                num = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "Numero: "));
            }while (num<0 || num>100) ;
                if (num > valor) {
                    valor = num;
                }
            }
                System.out.println("O valor maior é: " + valor);

        }
    }


