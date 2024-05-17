import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    TelaSimulator t = new TelaSimulator();
    t.setContentPane(t.painelPrincipal);
    t.setTitle("$$ Simulator $$");
    t.setSize(400,400);
    t.setVisible(true);
    t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}