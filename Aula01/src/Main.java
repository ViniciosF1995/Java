import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        JOptionPane.showMessageDialog(null, "Hello World do Swing :D" );
//        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
//        System.out.println(idade);

// System.out.println( JOptionPane.showConfirmDialog(null, "Tem certeza ?"));
// System.out.println( JOptionPane.showConfirmDialog(null, "Tem certeza ?"));
// System.out.println( JOptionPane.showConfirmDialog(null, "Tem certeza ?"));

// if(JOptionPane.showConfirmDialog(null, "Tem certeza ?") == 0){
//     JOptionPane.showMessageDialog(null, "Salvo");
// }

                ///////// int to str
                int idade = 18;
                String texto = Integer.toString(idade);
                System.out.println("Texto convertido: " + texto);

//        System.out.println("Texto convertido: " + Integer.toString(idade));

                /////////// str to int
                String textoParaConverter = "30";
                int valorConvertido = Integer.parseInt(textoParaConverter);
                System.out.println("Valor convertido: "+valorConvertido);

                /////////// str to float
                textoParaConverter = "3.04";
                float floatConvertido = Float.parseFloat(textoParaConverter);
                floatConvertido += 1.5;
                System.out.println("Float convertido: "+floatConvertido);
            }
        }
