package palavrasEmbaralhadas;

import java.io.IOException;

public class MecanicaDoJogoSuper implements MecanicaDoJogo {

	int dificuldadeNum;
	String dificuldadeTexto;
	int vidas;
	int vidasAtualizado;
	int pontos;
	int pontosAtualizado;
	int multiplicadorDePontosDaDificuldade;
	String resultadoDoJogo;
	boolean acertou;
	int acertos = 0;
	String PalavraDaRodada;
	String PalavraDaRodadaEmbaralhada;
	public boolean JaCarregouBanco;
	public boolean jogoTerminou;
	
	FabricaEmbaralhadores femb = new FabricaEmbaralhadores();
	BancoDePalavras bp = new BancoDePalavras();
	
	@Override
	public String escolhePalavraDaRodada() throws IOException {
		if (JaCarregouBanco == false) {
			bp.carregaInicialBancoDePalavrasArquivo();
			PalavraDaRodada = bp.retiraPalavraAleatoriaDoBanco();
			JaCarregouBanco = true;
		}else {
			PalavraDaRodada = bp.retiraPalavraAleatoriaDoBanco();
		}
		return PalavraDaRodada;
	}

	@Override
	public boolean jogoTermina() {
		if (vidasAtualizado == 0) {
			System.out.println("Você PERDEU, suas vidas abacaram");
			jogoTerminou = true;
			return jogoTerminou;
		}else {
			if (acertos == 3) {
				System.out.println("Você GANHOU, teve 3 acertos!!");
				jogoTerminou = true;
				return jogoTerminou;
			}else {
				jogoTerminou = false;
				return jogoTerminou;
			}
		}
	}

	@Override
	public int retornaVidas() {
		return vidasAtualizado;
	}

	@Override
	public void acertouAPalavra(String tentativa) {
		
		if (PalavraDaRodada.intern() == tentativa.intern()) {
			acertos = acertos+1;
			pontosAtualizado = acertos * multiplicadorDePontosDaDificuldade;
			System.out.println("");
			System.out.println("você ACERTOU a palavra!!");
			System.out.println("Você possui "+ acertos+" acertos / "+ vidasAtualizado+" vida(s) / "+pontosAtualizado+" pontos");
			System.out.println("");
		}else {
			vidasAtualizado = vidasAtualizado - 1;
			System.out.println("");
			System.out.println("você ERROU a palavra!! Resposta correta: "+PalavraDaRodada);
			System.out.println("Você possui "+ acertos+" acertos / "+ vidasAtualizado+" vida(s) / "+pontosAtualizado+" pontos");
			System.out.println("");
		}
	}

	@Override
	public String retornaDificuldade() {
		return dificuldadeTexto;
	}

	@Override
	public String escolheModalidadeDaMecanicaDoJogo(int dificuldade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int retornaPontuacaoAtual() {
		return pontosAtualizado;
	}

	@Override
	public String embaralhaPalavraDaRodada() throws IOException {
		PalavraDaRodadaEmbaralhada = femb.embaralharAPalavraDaRodadaAleatoriamente(PalavraDaRodada);
		return PalavraDaRodadaEmbaralhada;
	}

	@Override
	public String retornaPalavraDaRodada() {
		return PalavraDaRodada;
	}

	@Override
	public boolean retornaJogoTerminou() {
		return jogoTerminou;
	}

}
