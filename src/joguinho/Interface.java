package joguinho;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

public class Interface {
    private static JTextField textFieldNome;
    private static Jogador jogador;
    private static Robo robo1;
    private static Robo robo2;
    private static JLabel labelAlunosEncontrados;
    private static JLabel labelBugsIdentificados;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Joguinho");
        JPanel panel = new JPanel();
        
        JButton button = new JButton("Iniciar jogo!");
        panel.add(button);
        
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public static void exibirJanelaPrincipal() {
        JFrame janelaPrincipal = new JFrame("Jogo de Xadrez");
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelPrincipal = new JPanel();
        janelaPrincipal.getContentPane().add(painelPrincipal);

        JLabel labelNome = new JLabel("Nome do jogador:");
        textFieldNome = new JTextField(20);

        JButton botaoInterface = new JButton("Interface");
        botaoInterface.addActionListener(e -> iniciarJogo());

        painelPrincipal.add(labelNome);
        painelPrincipal.add(textFieldNome);
        painelPrincipal.add(botaoInterface);

        janelaPrincipal.pack();
        janelaPrincipal.setLocationRelativeTo(null);
        janelaPrincipal.setVisible(true);
    }

    private static void iniciarJogo() {
        String nomeJogador = textFieldNome.getText();
        jogador = new Jogador(nomeJogador);
        robo1 = new Robo();
        robo2 = new Robo();

        JFrame janelaJogo = new JFrame("Jogo de Xadrez");
        janelaJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelJogo = new JPanel(new BorderLayout());

        // Criar menu de opções para os robôs
        JMenuBar menuBar = new JMenuBar();
        JMenu menuRobos = new JMenu("Robôs");
        JMenuItem itemRobo1 = new JMenuItem("Robô 1");
        JMenuItem itemRobo2 = new JMenuItem("Robô 2");

        itemRobo1.addActionListener(e -> selecionarRobo(robo1));
        itemRobo2.addActionListener(e -> selecionarRobo(robo2));

        menuRobos.add(itemRobo1);
        menuRobos.add(itemRobo2);
        menuBar.add(menuRobos);
        janelaJogo.setJMenuBar(menuBar);

        // Criar quadro para exibir número de alunos e bugs
        JPanel painelQuadro = new JPanel();
        labelAlunosEncontrados = new JLabel("Alunos encontrados: 0");
        labelBugsIdentificados = new JLabel("Bugs identificados: 0");
        painelQuadro.add(labelAlunosEncontrados);
        painelQuadro.add(labelBugsIdentificados);
        painelJogo.add(painelQuadro, BorderLayout.NORTH);

        // Criar botões Verificar, Próxima Jogada e Sair do Jogo
        JPanel painelBotoes = new JPanel();
        JButton botaoVerificar = new JButton("Verificar");
        JButton botaoProximaJogada = new JButton("Próxima Jogada");
        JButton botaoSairJogo = new JButton("Sair do Jogo");

        botaoVerificar.addActionListener(e -> verificarCelulas());
        botaoProximaJogada.addActionListener(e -> proximaJogada());
        botaoSairJogo.addActionListener(e -> sairDoJogo(janelaJogo));

        painelBotoes.add(botaoVerificar);
        painelBotoes.add(botaoProximaJogada);
        painelBotoes.add(botaoSairJogo);
        painelJogo.add(painelBotoes, BorderLayout.SOUTH);

        janelaJogo.getContentPane().add(painelJogo);
        janelaJogo.pack();
        janelaJogo.setLocationRelativeTo(null);
        janelaJogo.setVisible(true);
    }

    private static void selecionarRobo(Robo robo) {
        // Lógica para selecionar o robô
        System.out.println("Robô selecionado: " + robo.toString());
    }

    private static void verificarCelulas() {
        // Lógica para verificar células ocupadas
        System.out.println("Verificando células...");
    }

    private static void proximaJogada() {
        // Lógica para realizar a próxima jogada
        System.out.println("Próxima jogada...");
    }

    private static void sairDoJogo(JFrame janela) {
        int opcao = JOptionPane.showConfirmDialog(janela, "Você deseja sair do jogo?", "Sair do Jogo", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            janela.dispose();
        }
    }
}