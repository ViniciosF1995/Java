import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaHome extends JFrame{

    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    public JPanel painelPrincipal;
    private JButton livroButton;
    private JButton milkshakeButton;
    private JButton juniorButton;
    private JButton plenoButton;
    private JButton seniorButton;
    private JTextArea textArea;



    private void mostrarPedidos(){
        String mostrar = "";

        for(Pedido p : pedidos){
            if(p.getClass() == Livro.class){
                Livro l = (Livro) p;
                mostrar += ("==========" + "\n" + "pedido: "+ l.getTipo() + "\n" + "Nome: " + l.getNome()+ "\n" + "Categoria: " + l.getCategoria()+ "\n") ;
            }else if(p.getClass() == Milkshake.class) {
                Milkshake m = (Milkshake) p;
                mostrar += ("==========" + "\n" + "pedido: "+ m.getTipo() + "\n" + "Tamanho: " + m.getTamanho()  + "\n" + "Sabor: " + m.getSabor() + "\n");
            }


        }
        textArea.setText(mostrar);

    }



    public TelaHome() {

        livroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeLivro = JOptionPane.showInputDialog("Qual o nome do livro?");
                String categoriaLivro = JOptionPane.showInputDialog("Qual genero do livro ?");
                Livro l = new Livro(pedidos.size()+1,"Livro",nomeLivro, categoriaLivro);
                pedidos.add(l);
                mostrarPedidos();
            }
        });
        milkshakeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String saborShake = JOptionPane.showInputDialog("Qual o sabor?");
                String tamanhoShake = JOptionPane.showInputDialog("Qual o tamanho?");
                Milkshake m = new Milkshake(pedidos.size()+1,"Milkshake",tamanhoShake,saborShake);
                pedidos.add(m);
                mostrarPedidos();
            }
        });


        juniorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(pedidos.size() != 0){
                    for (int i = 0; i < pedidos.size(); i++) {
                        String comparar = pedidos.get(i).getTipo();
                        System.out.println(comparar);
                        if(comparar.equals("Livro")){
                            int index = i;
                            pedidos.remove(index);
                            mostrarPedidos();
                            break;
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Não possui pedidos no momento.");
                }
                mostrarPedidos();
            }
        });
        plenoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pedidos.size() != 0){
                    for (int i = 0; i < pedidos.size(); i++) {
                        String comparar = pedidos.get(i).getTipo();
                        System.out.println(comparar);
                        if(comparar.equals("Milkshake")){
                            int index = i;
                            pedidos.remove(index);

                            break;
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Não possui pedidos no momento.");
                }
                mostrarPedidos();
            }
        });
        seniorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pedidos.size() != 0){
                    pedidos.remove(0);

                }else{
                    JOptionPane.showMessageDialog(null,"Não possui pedidos no momento.");
                }
                mostrarPedidos();

            }
        });
    }
}
