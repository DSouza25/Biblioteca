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

public class CadastroLivro {
    JPanel painelCadastro = new JPanel();

    Cores cor = new Cores();

    JLabel lblTitulo = new JLabel("Cadastrar livro");

    JLabel lblTituloLivro = new JLabel("Título: ");
    JTextField txtTituloLivro = new JTextField();

    JLabel lblAnoPublicacao = new JLabel("Ano de Publicação:  ");
    JTextField txtAnoPublicacao = new JTextField();

    JLabel lblAutor = new JLabel("Autor: ");
    JTextField txtNascimento = new JTextField();

    JLabel lblMatricula = new JLabel("Nº Matrícula: ");
    JTextField txtMatricula = new JTextField();

    JButton btnCadastrar = new JButton("Cadastrar");

    public static void configuraBorda(JTextField textField){
        Border borda = BorderFactory.createLineBorder(new Color(215,217,219), 2);
        Border margemInterna = new EmptyBorder(5,10,5,10);
        textField.setBorder(new CompoundBorder(borda, margemInterna));
    }

    public JPanel abrirTela(){
        // ---------- customização de componentes -------------------
        lblTitulo.setBounds(200, 20, 300,30);
        lblTitulo.setFont(new Font("Century Gothic", Font.BOLD, 26));
        
        lblTituloLivro.setBounds(80, 105, 100, 30);
        lblTituloLivro.setFont(new Font("Century Gothic", Font.BOLD, 16));
        txtTituloLivro.setBounds(80, 133, 450, 30);
        configuraBorda(txtTituloLivro);

        lblAnoPublicacao.setBounds(80, 163, 200, 30);
        lblAnoPublicacao.setFont(new Font("Century Gothic", Font.BOLD, 16));
        txtAnoPublicacao.setBounds(80, 191, 450, 30);
        configuraBorda(txtAnoPublicacao);

        lblAutor.setBounds(80, 221, 200, 30);
        lblAutor.setFont(new Font("Century Gothic", Font.BOLD, 16));
        txtNascimento.setBounds(80, 249, 450, 30);
        configuraBorda(txtNascimento);
        
        lblMatricula.setBounds(80, 279, 200, 30);
        lblMatricula.setFont(new Font("Century Gothic", Font.BOLD, 16));
        txtMatricula.setBounds(80, 306, 450, 30);
        txtMatricula.setEditable(false);
        txtMatricula.setFocusable(false);
        configuraBorda(txtMatricula);

        btnCadastrar.setBounds(200, 386, 200, 50);
        btnCadastrar.setBorder(null);
        btnCadastrar.setBackground(cor.getAzulMedio());
        btnCadastrar.setForeground(cor.getBranco());
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCadastrar.addMouseListener( new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                btnCadastrar.setFocusable(false);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnCadastrar.setBackground(cor.getAzulClaro());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnCadastrar.setBackground(cor.getAzulMedio());
            }
            
        });

        // -------------- adicionar ao painel ------------------------
        painelCadastro.add(btnCadastrar);
        painelCadastro.add(lblMatricula);
        painelCadastro.add(txtMatricula);
        painelCadastro.add(lblAutor);
        painelCadastro.add(txtNascimento);
        painelCadastro.add(lblAnoPublicacao);
        painelCadastro.add(txtAnoPublicacao);
        painelCadastro.add(lblTituloLivro);
        painelCadastro.add(txtTituloLivro);
        painelCadastro.add(lblTitulo);
        painelCadastro.setBounds(250, 0, 650, 600);
        painelCadastro.setLayout(null);
        painelCadastro.setBackground(cor.getBranco());

        return painelCadastro;
    }
}
