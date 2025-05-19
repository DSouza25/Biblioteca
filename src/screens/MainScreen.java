package screens;

import java.awt.Color;
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
    JPanel telaUsuario = new CadastroUsuario().abrirTela();
    JPanel indicador = new JPanel();
    JPanel telaLivro = new CadastroLivro().abrirTela();
    JPanel telaEmprestimo = new Emprestimo().abrirTela();
    JPanel telaRelatorio = new Relatorio().abrirTela();
    JPanel telaListaUsuarios = new ListarUsuarios().abrirTela();
    Cores cor = new Cores();
    JFrame janela = new JFrame("Biblioteca");
    JPanel conteudo = new JPanel();
    JPanel menu = new JPanel();
    JButton btnCadastrarUsuario = new JButton("Cadastrar usuario");
    JButton btnCadastrarLivro = new JButton("Cadastrar livro");
    JButton btnEmprestar = new JButton("Emprestar livro");
    JButton btnRelatorio = new JButton("Relatorio de usuario");
    JButton btnListarUsuarios = new JButton("Listar usuarios");
    Integer btnFocus = 1;
    
    
    
    public void estilizarBotao(JButton button, Color corFonte, Color corFundo){
        button.setBackground(corFundo);
        button.setFont(new Font("sans serif", Font.CENTER_BASELINE, 15));
        button.setForeground(corFonte);
        button.setFocusPainted(false);
        button.addActionListener(this);
        button.setBorder(null);
        button.addMouseListener(new MouseListener() {
            
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
                button.setCursor(new Cursor(Cursor.HAND_CURSOR));
                button.setBorderPainted(false);
                button.setBackground(cor.getAzulClaro());
                button.setForeground(cor.getBranco());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                button.setBackground(corFundo);
                button.setForeground(corFonte);
            }
            
        });
    }
    
    public void abrirTelaPrincipal(){
        // ----------- caracterização de componentes -------------
        menu.setBounds(0,0,250,600);
        menu.setBackground(cor.getAzulEscuro());
        
        btnEmprestar.setBounds(20, 180, 230, 60);
        btnCadastrarUsuario.setBounds(20, 250, 210, 60);
        btnCadastrarLivro.setBounds(20, 320, 210, 60);
        btnRelatorio.setBounds(20, 390, 210, 60);
        btnListarUsuarios.setBounds(20, 460, 210, 60);
        estilizarBotao(btnEmprestar, cor.getAzulEscuro(), cor.getBranco());
        estilizarBotao(btnCadastrarUsuario, cor.getBranco(), cor.getAzulMedio());
        estilizarBotao(btnCadastrarLivro, cor.getBranco(), cor.getAzulMedio());
        estilizarBotao(btnRelatorio, cor.getBranco(), cor.getAzulMedio());
        estilizarBotao(btnListarUsuarios, cor.getBranco(), cor.getAzulMedio());
        
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/screens/recursos/images/icone.png"));
        Image icone = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon iconeRedimensionado = new ImageIcon(icone);
        JLabel btnIcon = new JLabel(iconeRedimensionado);
        btnIcon.setBounds(75,40,100,100);
        btnIcon.setBackground(cor.getAzulMedio());

        telaEmprestimo.setVisible(true);
        telaUsuario.setVisible(false);
        telaLivro.setVisible(false);
        telaRelatorio.setVisible(false);
        telaListaUsuarios.setVisible(false);

        indicador.setBackground(cor.getAzulClaro());
        indicador.setBounds(230, 180, 20, 60);
        indicador.setVisible(false);

        // --------------- adicionar à janela --------------------
        janela.add(indicador);
        janela.add(telaListaUsuarios);
        janela.add(telaUsuario);
        janela.add(telaLivro);
        janela.add(telaRelatorio);
        janela.add(telaEmprestimo);
        janela.add(btnIcon);
        janela.add(btnListarUsuarios);
        janela.add(btnEmprestar);
        janela.add(btnCadastrarUsuario);
        janela.add(btnCadastrarLivro);
        janela.add(btnRelatorio);
        janela.add(menu);
        janela.add(conteudo);
        janela.setSize(900,600);
        janela.setResizable(false);
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
            telaListaUsuarios.setVisible(false);

            btnEmprestar.setBounds(20, 180, 230, 60);
            btnCadastrarUsuario.setBounds(20, 250, 210, 60);
            btnCadastrarLivro.setBounds(20, 320, 210, 60);
            btnRelatorio.setBounds(20, 390, 210, 60);
            btnListarUsuarios.setBounds(20, 460, 210, 60);
            estilizarBotao(btnEmprestar, cor.getAzulEscuro(), cor.getBranco());

            switch (btnFocus) {
                case 2:
                    estilizarBotao(btnCadastrarUsuario, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 3:
                    estilizarBotao(btnCadastrarLivro, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 4:
                    estilizarBotao(btnRelatorio, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 5:
                    estilizarBotao(btnListarUsuarios, cor.getBranco(), cor.getAzulMedio());                
                    break;
                default:
                    break;
            }
            btnFocus = 1;

        }
        if (e.getSource() == btnCadastrarUsuario) {
            telaEmprestimo.setVisible(false);
            telaUsuario.setVisible(true);
            telaLivro.setVisible(false);
            telaRelatorio.setVisible(false);
            telaListaUsuarios.setVisible(false);

            btnEmprestar.setBounds(20, 180, 210, 60);
            btnCadastrarUsuario.setBounds(20, 250, 230, 60);
            btnCadastrarLivro.setBounds(20, 320, 210, 60);
            btnRelatorio.setBounds(20, 390, 210, 60);
            btnListarUsuarios.setBounds(20, 460, 210, 60);
            estilizarBotao(btnCadastrarUsuario, cor.getAzulEscuro(), cor.getBranco());
            switch (btnFocus) {
                case 1:
                    estilizarBotao(btnEmprestar, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 3:
                    estilizarBotao(btnCadastrarLivro, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 4:
                    estilizarBotao(btnRelatorio, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 5:
                    estilizarBotao(btnListarUsuarios, cor.getBranco(), cor.getAzulMedio());                
                    break;
                default:
                    break;
            }
            btnFocus = 2;

        }
        if (e.getSource() == btnCadastrarLivro) {
            telaEmprestimo.setVisible(false);
            telaUsuario.setVisible(false);
            telaLivro.setVisible(true);
            telaRelatorio.setVisible(false);
            telaListaUsuarios.setVisible(false);

            btnEmprestar.setBounds(20, 180, 210, 60);
            btnCadastrarUsuario.setBounds(20, 250, 210, 60);
            btnCadastrarLivro.setBounds(20, 320, 230, 60);
            btnRelatorio.setBounds(20, 390, 210, 60);
            btnListarUsuarios.setBounds(20, 460, 210, 60);

            estilizarBotao(btnCadastrarLivro, cor.getAzulEscuro(), cor.getBranco());
            switch (btnFocus) {
                case 2:
                    estilizarBotao(btnCadastrarUsuario, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 1:
                    estilizarBotao(btnEmprestar, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 4:
                    estilizarBotao(btnRelatorio, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 5:
                    estilizarBotao(btnListarUsuarios, cor.getBranco(), cor.getAzulMedio());                
                    break;
                default:
                    break;
            }
            btnFocus = 3;
            

        }
        if (e.getSource() == btnRelatorio) {
            telaEmprestimo.setVisible(false);
            telaUsuario.setVisible(false);
            telaLivro.setVisible(false);
            telaRelatorio.setVisible(true);
            telaListaUsuarios.setVisible(false);

            btnEmprestar.setBounds(20, 180, 210, 60);
            btnCadastrarUsuario.setBounds(20, 250, 210, 60);
            btnCadastrarLivro.setBounds(20, 320, 210, 60);
            btnRelatorio.setBounds(20, 390, 230, 60);
            btnListarUsuarios.setBounds(20, 460, 210, 60);

            estilizarBotao(btnRelatorio, cor.getAzulEscuro(), cor.getBranco());
            switch (btnFocus) {
                case 2:
                    estilizarBotao(btnCadastrarUsuario, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 3:
                    estilizarBotao(btnCadastrarLivro, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 1:
                    estilizarBotao(btnEmprestar, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 5:
                    estilizarBotao(btnListarUsuarios, cor.getBranco(), cor.getAzulMedio());                
                    break;
                default:
                    break;
            }
            btnFocus = 4;
            
        }
        if (e.getSource() == btnListarUsuarios) {
            telaEmprestimo.setVisible(false);
            telaUsuario.setVisible(false);
            telaLivro.setVisible(false);
            telaRelatorio.setVisible(false);
            telaListaUsuarios.setVisible(true);

            btnEmprestar.setBounds(20, 180, 210, 60);
            btnCadastrarUsuario.setBounds(20, 250, 210, 60);
            btnCadastrarLivro.setBounds(20, 320, 210, 60);
            btnRelatorio.setBounds(20, 390, 210, 60);
            btnListarUsuarios.setBounds(20, 460, 230, 60);
            estilizarBotao(btnListarUsuarios, cor.getBranco(), cor.getAzulMedio());

            switch (btnFocus) {
                case 2:
                    estilizarBotao(btnCadastrarUsuario, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 3:
                    estilizarBotao(btnCadastrarLivro, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 4:
                    estilizarBotao(btnRelatorio, cor.getBranco(), cor.getAzulMedio());
                    break;
                case 1:
                    estilizarBotao(btnEmprestar, cor.getBranco(), cor.getAzulMedio());                
                    break;
                default:
                    break;
            }
            btnFocus = 5;
        }
    }
}
