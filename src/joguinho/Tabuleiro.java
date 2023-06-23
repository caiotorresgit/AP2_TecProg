package joguinho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabuleiro {
    private JButton[][] botoes;
    private JPanel painelTabuleiro;

    public Tabuleiro() {
        botoes = new JButton[8][8];
        painelTabuleiro = new JPanel(new GridLayout(8, 8));

        // Criar os botões e adicioná-los ao painelTabuleiro
        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                JButton botao = new JButton();
                botao.setPreferredSize(new Dimension(60, 60));
                botao.addActionListener(new BotaoClicadoListener(linha, coluna));
                botoes[linha][coluna] = botao;
                painelTabuleiro.add(botao);
            }
        }
    }

    public JPanel getPainelTabuleiro() {
        return painelTabuleiro;
    }

    public void atualizarTabuleiro() {
        // Atualizar o estado visual do tabuleiro
        // Aqui você pode definir o texto, cor de fundo ou ícone dos botões, dependendo da lógica do jogo
    }

    private class BotaoClicadoListener implements ActionListener {
        private int linha;
        private int coluna;

        public BotaoClicadoListener(int linha, int coluna) {
            this.linha = linha;
            this.coluna = coluna;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Lógica a ser executada quando um botão do tabuleiro for clicado
            System.out.println("Botão [" + linha + ", " + coluna + "] clicado!");
        }
    }
}
