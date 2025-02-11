package jogoDaVelha;
import java.util.Scanner;

public class JogoDaVelha extends Object {
    static char[][] tabuleiro = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
    static char jogadorAtual = 'X';
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean jogoAtivo = true;

        while (jogoAtivo) {
            interfaceJogo();
            int jogada = scanner.nextInt();

            if (validaJogada(jogada)) {
                atualizaTabuleiro(jogada);
                if (vitoria()) {
                    exibeFim(1);
                    jogoAtivo = false;
                } else if (empate()) {
                    exibeFim(0);
                    jogoAtivo = false;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            } else {
                restricao();
            }
        }
    }

    static void interfaceJogo() {
        System.out.println("Jogador " + jogadorAtual + ", é a sua vez.");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Escolha uma posição (1-9): ");
    }

    static boolean validaJogada(int jogada) {
        if (jogada < 1 || jogada > 9) {
            return false;
        }

        int linha = (jogada - 1) / 3;
        int coluna = (jogada - 1) % 3;

        return tabuleiro[linha][coluna] != 'X' && tabuleiro[linha][coluna] != 'O';
    }

    static void atualizaTabuleiro(int jogada) {
        int linha = (jogada - 1) / 3;
        int coluna = (jogada - 1) % 3;
        tabuleiro[linha][coluna] = jogadorAtual;
    }


    static void restricao() {
        System.out.println("Jogada inválida. Tente novamente.");
    }

    static boolean empate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] != 'X' && tabuleiro[i][j] != 'O') {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean vitoria() {
            for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true;    
            }
        }

        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
                return true;
            }
        }

        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
            return true;
        }
        return tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual;
    }

    static void exibeFim(int resultado) {
        if (resultado == 1) {
            System.out.println("Jogador " + jogadorAtual + " venceu o jogo!");
        } else {
            System.out.println("O jogo terminou empatado! Deu velha.");
        }

    }
}

