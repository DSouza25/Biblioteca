package screens;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import screens.recursos.Cores;

public class MainScreen implements ActionListener{
    // ---------------- declaração de componentes -----------------
    JPanel telaUsuario = new CadastroUsuario().abrirTelaCadastro();
    JPanel telaLivro = new CadastroLivro().abrirTelaCadastro();
    JPanel telaEmprestimo = new Emprestimo().abrirTelaCadastro();
    JPanel telaRelatorio = new Relatorio().abrirTelaCadastro();
    Cores cor = new Cores();
    JFrame janela = new JFrame("Biblioteca");
    JPanel conteudo = new JPanel();
    JPanel menu = new JPanel();
    JButton btnCadastrarUsuario = new JButton("Cadastrar usuario");
    JButton btnCadastrarLivro = new JButton("Cadastrar livro");
    JButton btnEmprestar = new JButton("Emprestar livro");
    JButton btnRelatorio = new JButton("Relatorio de usuario");
    
    
    
    public void estilizarBotao(JButton button){
        button.setBackground(cor.getAzulClaro());
        button.setFont(new Font("sans serif", Font.CENTER_BASELINE, 15));
        button.setForeground(cor.getBranco());
        button.setFocusPainted(false);
        button.addActionListener(this);
        button.addMouseListener(new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
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
                button.setCursor(new Cursor(Cursor.HAND_CURSOR));
                button.setBorderPainted(false);
                button.setBackground(cor.getAzulMedio());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                button.setBackground(cor.getAzulClaro());
            }
            
        });
    }
    
    public void abrirTelaPrincipal(){
        // ----------- caracterização de componentes -------------
        menu.setBounds(0,0,250,600);
        menu.setBackground(cor.getAzulEscuro());
        
        btnEmprestar.setBounds(20, 200, 210, 60);
        btnCadastrarUsuario.setBounds(20, 270, 210, 60);
        btnCadastrarLivro.setBounds(20, 340, 210, 60);
        btnRelatorio.setBounds(20, 410, 210, 60);
        estilizarBotao(btnEmprestar);
        estilizarBotao(btnCadastrarUsuario);
        estilizarBotao(btnCadastrarLivro);
        estilizarBotao(btnRelatorio);
        
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/screens/recursos/images/icone.png"));
        Image icone = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon iconeRedimensionado = new ImageIcon(icone);
        JLabel btnIcon = new JLabel(iconeRedimensionado);
        btnIcon.setBounds(75,70,100,100);
        btnIcon.setBackground(cor.getAzulMedio());

        telaEmprestimo.setVisible(false);
        telaUsuario.setVisible(false);
        telaLivro.setVisible(false);
        telaRelatorio.setVisible(false);

        // --------------- adicionar à janela --------------------
        janela.add(telaUsuario);
        janela.add(telaLivro);
        janela.add(telaRelatorio);
        janela.add(telaEmprestimo);
        janela.add(btnIcon);
        janela.add(btnEmprestar);
        janela.add(btnCadastrarUsuario);
        janela.add(btnCadastrarLivro);
        janela.add(btnRelatorio);
        janela.add(menu);
        janela.add(conteudo);
        janela.setSize(900,600);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEmprestar) {
            telaEmprestimo.setVisible(true);
            telaUsuario.setVisible(false);
            telaLivro.setVisible(false);
            telaRelatorio.setVisible(false);
        }
        if (e.getSource() == btnCadastrarUsuario) {
            telaEmprestimo.setVisible(false);
            telaUsuario.setVisible(true);
            telaLivro.setVisible(false);
            telaRelatorio.setVisible(false);
        }
        if (e.getSource() == btnCadastrarLivro) {
            telaEmprestimo.setVisible(false);
            telaUsuario.setVisible(false);
            telaLivro.setVisible(true);
            telaRelatorio.setVisible(false);
        }
        if (e.getSource() == btnRelatorio) {
            telaEmprestimo.setVisible(false);
            telaUsuario.setVisible(false);
            telaLivro.setVisible(false);
            telaRelatorio.setVisible(true);
        }
    }
}
