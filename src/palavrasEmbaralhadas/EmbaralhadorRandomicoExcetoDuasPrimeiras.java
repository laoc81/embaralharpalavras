package palavrasEmbaralhadas;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class EmbaralhadorRandomicoExcetoDuasPrimeiras extends EmbaralhadorSuper {
	
	@Override
	public String pegarEembaralharAPalavraPega(String palavra) {	
		modoEmbaralhamento = "Modo aleatório, exceto duas primeiras letras mantidas";
		StringBuilder embaralhada = new StringBuilder();
		StringBuilder original = new StringBuilder(palavra);
		Random r = new Random();	
			for (int i=0; i<2;i++) {
				embaralhada.append(original.charAt(i));
			}	
		original = original.deleteCharAt(0);
		original = original.deleteCharAt(0);
		int tamanho = palavra.length();	
			for (int k=2; k<tamanho;k++) {
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
