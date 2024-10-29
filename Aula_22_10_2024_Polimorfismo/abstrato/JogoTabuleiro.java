//package abstrato;

public class JogoTabuleiro extends Jogo {
    String tipoTabuleiro;

    public JogoTabuleiro(String nome, int nJogadores, String tipoTabuleiro) {
        super(nome, nJogadores);
        this.tipoTabuleiro = tipoTabuleiro;
    }

    public void iniciar() {
        System.out.println("Jogo de tabuleiro: " + super.nome);
    }

    public void regras() {
        System.out.println("Cada jogador possui as suas peças");
    }

}
