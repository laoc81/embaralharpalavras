package palavrasEmbaralhadas;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class EmbaralhadorRandomicoTudo extends EmbaralhadorSuper {
	
	@Override
	public String pegarEembaralharAPalavraPega(String palavra) {
		modoEmbaralhamento = "Modo aleat�rio todas as letras";
		StringBuilder embaralhada = new StringBuilder();
		StringBuilder original = new StringBuilder(palavra);
		Random r = new Random();
		int tamanho = palavra.length();
			for (int i=0; i<tamanho;i++) {
				int rch = r.nextInt(original.length());
				embaralhada.append(original.charAt(rch));
				original = original.deleteCharAt(rch);
			}
		embaralhadaFinal = embaralhada.toString();
		return embaralhadaFinal;
	}

	@Override
	public HashMap<Integer, String> cargaInicialBancoDePalavrasArquivo() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pegaModoEmbaralhamento() {
		return modoEmbaralhamento;
	}
	
	@Override
	public String embaralharAPalavraDaRodadaAleatoriamente(String palavra) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}	

}
