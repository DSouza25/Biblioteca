package screens;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Emprestimo {
JPanel painelCadastro = new JPanel();
    JLabel teste = new JLabel("Emprestimo");

    public JPanel abrirTelaCadastro(){
        teste.setBounds(20, 20, 150, 50);

        painelCadastro.setBounds(250, 0, 650, 600);
        painelCadastro.setBackground(Color.RED);
        painelCadastro.add(teste);

        return painelCadastro;
    }
}
