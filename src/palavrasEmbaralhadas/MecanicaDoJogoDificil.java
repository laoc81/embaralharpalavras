package palavrasEmbaralhadas;

public class MecanicaDoJogoDificil extends MecanicaDoJogoSuper {
	
	public MecanicaDoJogoDificil() {
		this.vidas = 2;
		this.vidasAtualizado = vidas;
		this.pontos = 0;
		this.pontosAtualizado = pontos;
		this.multiplicadorDePontosDaDificuldade = 10;
		this.dificuldadeTexto = "Difícil";
	}
	
}
