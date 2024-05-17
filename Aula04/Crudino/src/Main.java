import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        TelaCrud t = new TelaCrud();
        t.setContentPane(t.painelPrincipal);
        t.setTitle("Cadastros Dino");
        t.setSize(800,600);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        }
    }
