package palavrasEmbaralhadas;

public class MecanicaDoJogoMedia extends MecanicaDoJogoSuper {
	
	public MecanicaDoJogoMedia() {
			this.vidas = 4;
			this.vidasAtualizado = vidas;
			this.pontos = 0;
			this.pontosAtualizado = pontos;
			this.multiplicadorDePontosDaDificuldade = 3;
			this.dificuldadeTexto = "Média";
		}

}
