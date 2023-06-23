package joguinho;

import javax.swing.SwingUtilities;

public class Jogo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Interface::exibirJanelaPrincipal);
    }
}