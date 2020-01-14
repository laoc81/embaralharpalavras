package palavrasEmbaralhadas;

public class MecanicaDoJogoFacil extends MecanicaDoJogoSuper {
	
	public MecanicaDoJogoFacil() {
		this.vidas = 6;
		this.vidasAtualizado = vidas;
		this.pontos = 0;
		this.pontosAtualizado = pontos;
		this.multiplicadorDePontosDaDificuldade = 1;
		this.dificuldadeTexto = "Fácil";
	}

}
