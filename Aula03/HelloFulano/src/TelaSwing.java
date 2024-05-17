import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSwing extends JFrame {
    public JPanel painelPrincipal;
    private JTextField txtNome;
    private JButton btnEnviar;
    private JLabel lblSaida;

    public TelaSwing() {
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // JOptionPane.showMessageDialog(null, "Ola " + txtNome.getText());
                lblSaida.setText("Ola " + txtNome.getText());
            }
        });
    }
}
