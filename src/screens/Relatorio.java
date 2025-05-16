package screens;



import javax.swing.JLabel;
import javax.swing.JPanel;

import screens.recursos.Cores;

public class Relatorio {
    JPanel painelCadastro = new JPanel();
    JLabel teste = new JLabel("Relatorio");
    Cores cor = new Cores();
    public JPanel abrirTela(){
        teste.setBounds(20, 20, 150, 50);

        painelCadastro.setBounds(250, 0, 650, 600);
        painelCadastro.setBackground(cor.getBranco());
        painelCadastro.add(teste);

        return painelCadastro;
    }
}
