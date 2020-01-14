package palavrasEmbaralhadas;

import java.io.IOException;
import java.util.HashMap;

public class EmbaralhadorInverter extends EmbaralhadorSuper {
	
	@Override
	public String pegarEembaralharAPalavraPega(String palavra) {
		modoEmbaralhamento = "Modo Invertido";
		StringBuffer invertida = new StringBuffer(palavra);
		embaralhadaFinal = invertida.reverse().toString();
		return embaralhadaFinal;
	}
	
	@Override
	public HashMap<Integer, String> cargaInicialBancoDePalavrasArquivo() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String embaralharAPalavraDaRodadaAleatoriamente(String palavra) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pegaModoEmbaralhamento() {
		return modoEmbaralhamento;
	}

}
