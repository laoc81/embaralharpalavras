package palavrasEmbaralhadas;

import java.io.IOException;
import java.util.HashMap;

public interface Embaralhador {
	 
	public HashMap<Integer, String> cargaInicialBancoDePalavrasArquivo() throws IOException;
	public abstract String pegarPalavra() throws IOException;
	public abstract String pegarEembaralharAPalavraPega(String palavra);
	public abstract String embaralharAPalavraDaRodadaAleatoriamente(String palavra) throws IOException;
	public abstract HashMap<Integer, String> bancoDeDadosAtualizado();
	public abstract String pegaModoEmbaralhamento();
	
}
