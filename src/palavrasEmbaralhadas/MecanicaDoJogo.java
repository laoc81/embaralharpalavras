package palavrasEmbaralhadas;

import java.io.IOException;

public interface MecanicaDoJogo {
	
	public String escolheModalidadeDaMecanicaDoJogo(int dificuldade);
	public String retornaDificuldade();
	public String escolhePalavraDaRodada() throws IOException;
	public String retornaPalavraDaRodada();
	public String embaralhaPalavraDaRodada() throws IOException;
	public boolean jogoTermina();
	public boolean retornaJogoTerminou();
	public int retornaVidas();
	public int retornaPontuacaoAtual();
	public void acertouAPalavra(String tentativa);
	
}
