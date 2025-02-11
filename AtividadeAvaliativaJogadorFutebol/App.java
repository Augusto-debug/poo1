package AtividadeAvaliativaJogadorFutebol;
import java.util.Calendar;
import java.util.Objects;
public class App {
    public static void main(String[] args) {
        JogadorFutebol j1 = new JogadorFutebol("Neymar", "atacante", 1992, "Brasileiro", 1.75, 68.5);
        JogadorFutebol j2 = new JogadorFutebol("robson", "meiocampo", 1992, "Brasileiro", 1.75, 68.5);
        System.out.println(exibe(j1));
        System.out.println(exibe(j2));
    }
    private static int leDados(JogadorFutebol jogador) {
        return Calendar.getInstance().get(Calendar.YEAR) - jogador.anoNascimento;
    }
    private static String exibe(JogadorFutebol jogador) {
        int idade = leDados(jogador);
        String posicao = jogador.posicao;
        int aposentadoria;
        if (posicao.equalsIgnoreCase("atacante")) {
            aposentadoria = 35;
            return ("Faltam " + (aposentadoria - idade) + " anos para o jogador " + jogador.getNome() + " se aposentar.");
        } else if (Objects.equals(posicao.toLowerCase(), "meiocampo")) {
            aposentadoria = 38;
            return ("Faltam " + (aposentadoria - idade) + " anos para o jogador " + jogador.getNome() + " se aposentar.");
        } else {
            aposentadoria = 40;
            return ("Faltam " + (aposentadoria - idade) + " anos para o jogador " + jogador.getNome() + " se aposentar.");
        }
    }
}
