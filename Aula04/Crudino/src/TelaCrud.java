import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaCrud extends JFrame{
    private JTextField txtAltura;
    private JTextField txtNome;
    private JTextField intPeso;
    public JPanel painelPrincipal;
    private JButton btnEnviar;
    private JButton btnLocalizar;
    private JButton btnSalvar;
    private JButton btnExcluir;
    private JTextArea txtTodos;

    private ArrayList<Dino> dinos = new ArrayList<Dino>();

    private Dino alvo = null;
    private void mostrarTodos() {

        String mostrar = "";
        for (int i = 0; i < dinos.size(); i++) {

            mostrar += ("Nome: " + dinos.get(i).getNome() + "\n" + "Valor" + dinos.get(i).getAltura() + "\n " + "Peso" + dinos.get(i).getPeso() + "\n\n");

            txtTodos.setText(mostrar);
        }

    }
        private void limparInputs(){

            txtNome.setText("");
            txtAltura.setText("");
            intPeso.setText("");

        }



    public TelaCrud() {



        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = txtNome.getText();
                int altura = Integer.parseInt(txtAltura.getText());
                float peso = Float.parseFloat(intPeso.getText());
                Dino d = new Dino(nome, altura, peso);
                dinos.add(d);

                mostrarTodos();
                limparInputs();

            }
        });
        btnLocalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for(int i = 0; i < dinos.size(); i++) {
                    String nome = txtNome.getText();

                    String compararNome =  dinos.get(i).getNome() ;
                    if(compararNome.equals(nome)) {
                        alvo = dinos.get(i);
                       String mostrarNome = alvo.getNome();
                       String mostrarAltura = Integer.toString(alvo.getAltura());
                       String mostrarPeso = Float.toString(alvo.getPeso());

                        txtNome.setText(mostrarNome);
                        txtAltura.setText(mostrarAltura);
                        intPeso.setText(mostrarPeso);

                    }
                    mostrarTodos();
                }

            }
        });
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(alvo != null) {
                    alvo.setNome(txtNome.getText());
                    alvo.setAltura(Integer.parseInt(txtAltura.getText()));
                    alvo.setPeso(Float.parseFloat(intPeso.getText()));
                }else {

                    JOptionPane.showMessageDialog(null,"Não Cadastrou Merda");
                }
                mostrarTodos();
                limparInputs();
                alvo = null;
                }

        });
        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = txtNome.getText();
                for(int i = 0; i < dinos.size(); i++) {

                    String comparar =  dinos.get(i).getNome();
                    if(comparar.equals(nome)) {
                        int index = i;
                        dinos.remove(index);
                    }
                    mostrarTodos();
                }
            }
        });
    }
}
