package screens;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;


import screens.recursos.Cores;

public class Emprestimo {
    JPanel painel = new JPanel();
    Cores cor = new Cores();

    JLabel lblTitulo = new JLabel("Empréstimo de livro");

    JLabel lblMatriculaUsuario = new JLabel("Nº Matricula do Usuário");
    JTextField txtMatriculaUsuario = new JTextField();

    JLabel lblMatriculaLivro = new JLabel("Nº Matricula do Livro");
    JTextField txtMatriculaLivro = new JTextField();

    JButton btnEmprestar = new JButton("Emprestar");


    public static void configuraBorda(JTextField textField){
        Border borda = BorderFactory.createLineBorder(new Color(215,217,219), 2);
        Border margemInterna = new EmptyBorder(5,10,5,10);
        textField.setBorder(new CompoundBorder(borda, margemInterna));
    }

    public JPanel abrirTela(){
        // ------------- customização de componentes ----------------
        lblTitulo.setBounds(200, 20, 300,30);
        lblTitulo.setFont(new Font("Century Gothic", Font.BOLD, 26));

        lblMatriculaUsuario.setBounds(80, 105, 200, 30);
        lblMatriculaUsuario.setFont(new Font("Century Gothic", Font.BOLD, 16));
        txtMatriculaUsuario.setBounds(80, 133, 450, 30);
        configuraBorda(txtMatriculaUsuario);

        lblMatriculaLivro.setBounds(80, 173, 200, 30);
        lblMatriculaLivro.setFont(new Font("Century Gothic", Font.BOLD, 16));
        txtMatriculaLivro.setBounds(80, 201, 450, 30);
        configuraBorda(txtMatriculaLivro);


        btnEmprestar.setBounds(200, 386, 200, 50);
        btnEmprestar.setBorder(null);
        btnEmprestar.setBackground(cor.getAzulMedio());
        btnEmprestar.setForeground(cor.getBranco());
        btnEmprestar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnEmprestar.setFocusPainted(false);
        btnEmprestar.addMouseListener( new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnEmprestar.setBackground(cor.getAzulClaro());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnEmprestar.setBackground(cor.getAzulMedio());
            }

            
            
        });
        // ----------------- adicionar ao painel --------------------
        
        painel.add(btnEmprestar);
        painel.add(txtMatriculaLivro);
        painel.add(lblMatriculaLivro);
        painel.add(txtMatriculaUsuario);
        painel.add(lblMatriculaUsuario);
        painel.add(lblTitulo);
        painel.setBounds(250, 0, 650, 600);
        painel.setBackground(cor.getBranco());
        painel.setLayout(null);

        return painel;
    }
}
